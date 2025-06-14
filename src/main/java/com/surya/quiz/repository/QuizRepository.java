package com.surya.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.quiz.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
