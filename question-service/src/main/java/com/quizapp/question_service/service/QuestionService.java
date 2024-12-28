package com.quizapp.question_service.service;


import com.quizapp.question_service.model.Question;
import com.quizapp.question_service.model.QuestionWrapper;
import com.quizapp.question_service.model.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {

    ResponseEntity<List<Question>> getAllQuestions();

    ResponseEntity<List<Question>> getQuestionsByCategory(String category);

    ResponseEntity<String> addQuestion(Question question);


    ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions);

    ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds);

    ResponseEntity<Integer> getScore(List<Response> responses);
}
