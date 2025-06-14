package com.surya.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Quiz {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer numOfQuestions;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumOfQuestions() {
		return numOfQuestions;
	}

	public void setNumOfQuestions(Integer numOfQuestions) {
		this.numOfQuestions = numOfQuestions;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Quiz() {
		super();
	}

	public Quiz(Long id, String title, Integer numOfQuestions, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.numOfQuestions = numOfQuestions;
		this.category = category;
	}
    
}
