package com.quizapp.quiz_service.model;

import lombok.Data;

@Data
public class QuizDTO {

    private String categoryName;
    private String title;
    private Integer numQuestions;
}
