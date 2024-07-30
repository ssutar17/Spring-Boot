package com.Thymeleaf.RegistrationForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Thymeleaf.RegistrationForm.entity.User;

@Controller
public class UserController {

	@GetMapping("/getForm")
	public String form(Model model) {
		model.addAttribute("user", new User());
		return "registrationForm";
	}
	
	@PostMapping("/getForm")
	public String result(@ModelAttribute User user, Model model) {
		model.addAttribute("user", user);
		return "result";
	}
}
