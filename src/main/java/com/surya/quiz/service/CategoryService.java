package com.surya.quiz.service;

import java.util.List;

import com.surya.quiz.entity.Category;


public interface CategoryService {
	Category addCategory(Category category);
	List<Category> getAllCategories();
	Category getCategoryById(Long id);
	void deleteCategory(Long id);
}
