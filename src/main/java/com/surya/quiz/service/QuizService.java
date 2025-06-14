package com.surya.quiz.service;

import java.util.List;

import com.surya.quiz.entity.Quiz;

public interface QuizService {
	Quiz createQuiz(Quiz quiz);
    List<Quiz> getAllQuizzes();
    Quiz getQuizById(Long id);
    void deleteQuiz(Long id);
}
