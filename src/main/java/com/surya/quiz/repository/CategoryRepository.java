package com.surya.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.quiz.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
