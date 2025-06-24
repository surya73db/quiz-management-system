package com.surya.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surya.quiz.entity.Category;
import com.surya.quiz.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping()
	@PreAuthorize("hasRole('ADMIN')")
	public Category add(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}
	
	@GetMapping()
	public List<Category> getAll() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public Category getById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		categoryService.deleteCategory(id);
	}
}
