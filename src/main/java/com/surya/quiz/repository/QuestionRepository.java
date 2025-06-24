package com.surya.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.quiz.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
	List<Question> findByQuizId(Long quizID);
}
