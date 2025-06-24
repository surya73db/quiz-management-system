package com.surya.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Question text must not be blank.")
	@Size(min = 5, max = 300, message = "Question text must be between 5 and 300 characters.")
	private String questionText;
	
	@NotBlank(message = "option1 must not be blank")
	private String option1;
	
	@NotBlank(message = "option2 must not be blank")
	private String option2;
	
	@NotBlank(message = "option3 must not be blank")
	private String option3;
	
	@NotBlank(message = "option4 must not be blank")
	private String option4;
	
	@NotBlank(message = "Correct Answer must not be blank")
	private String correctAnswer;
	
	@ManyToOne
	@JoinColumn(name = "quiz_id")
	private Quiz quiz;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Question(Long id, String questionText, String option1, String option2, String option3, String option4,
			String correctAnswer, Quiz quiz) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
		this.quiz = quiz;
	}

	public Question() {
		super();
	}
	
	
	
}
