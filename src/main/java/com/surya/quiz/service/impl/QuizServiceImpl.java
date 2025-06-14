package com.surya.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.quiz.entity.Quiz;
import com.surya.quiz.repository.QuizRepository;
import com.surya.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizRepository quizRepository;
	
	@Override
	public Quiz createQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getAllQuizzes() {
		return quizRepository.findAll();
	}

	@Override
	public Quiz getQuizById(Long id) {
		return quizRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteQuiz(Long id) {
		quizRepository.deleteById(id);
	}

}
