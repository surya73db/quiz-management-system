package com.surya.quiz.service;

import java.util.List;

import com.surya.quiz.entity.Question;

public interface QuestionService {

	Question addQuestion(Question question);
	List<Question> getQuestionsByQuizId(Long quizId);
	List<Question> getAllQuestions();
    void deleteQuestion(Long id);
}
