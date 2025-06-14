package com.surya.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surya.quiz.entity.Category;
import com.surya.quiz.repository.CategoryRepository;
import com.surya.quiz.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public void deleteCategory(Long id) {
    	categoryRepository.deleteById(id);
    }
}
