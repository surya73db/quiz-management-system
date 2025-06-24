package com.surya.quiz.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
	
	@GetMapping("admin/dashboard")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminDashboard() {
		return "ADMIN Dashboard Content";
	}
}
