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

import com.surya.quiz.entity.Question;
import com.surya.quiz.service.QuestionService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
    private QuestionService questionService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Question add(@Valid @RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @GetMapping("/quiz/{quizId}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Question> getByQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionsByQuizId(quizId);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Question> getAll() {
        return questionService.getAllQuestions();
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void delete(@PathVariable Long id) {
        questionService.deleteQuestion(id);
    }
}
