package com.quizapp.quiz_service.service;


import com.quizapp.quiz_service.model.QuestionWrapper;
import com.quizapp.quiz_service.model.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuizService {
    ResponseEntity<String> createQuiz(String category, Integer numQ, String title);

    ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id);

    ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses);
}
