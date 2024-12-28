package com.quizapp.quiz_service.service.serviceimpl;


import com.quizapp.quiz_service.feign.QuizFeign;
import com.quizapp.quiz_service.model.QuestionWrapper;
import com.quizapp.quiz_service.model.Quiz;
import com.quizapp.quiz_service.model.Response;
import com.quizapp.quiz_service.repository.QuizRepository;
import com.quizapp.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImp implements QuizService {

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    QuizFeign quizFeign;

    @Override
    public ResponseEntity<String> createQuiz(String category, Integer numQ, String title) {

        // call generate url - there is concept called RestTemplate that call url from other service;

        List<Integer> questions = quizFeign.getQuestionsForQuiz(category, numQ).getBody();

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionsIds(questions);
        quizRepository.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizRepository.findById(id);
        List<Integer> questionIds = quiz.get().getQuestionsIds();
        List<QuestionWrapper> questionsForUser = quizFeign.getQuestionsFromId(questionIds).getBody();

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        ResponseEntity<Integer> score = quizFeign.getScore(responses);

        return score;
    }
}
