package com.quizapp.quiz_service.controller;

import com.quizapp.quiz_service.model.QuestionWrapper;
import com.quizapp.quiz_service.model.QuizDTO;
import com.quizapp.quiz_service.model.Response;
import com.quizapp.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> create(@RequestBody QuizDTO quizDTO){
        return quizService.createQuiz(quizDTO.getCategoryName(), quizDTO.getNumQuestions(), quizDTO.getTitle());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable("id") Integer id){
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable("id") Integer id,@RequestBody List<Response> responses){
        return quizService.calculateResult(id, responses);
    }
}
