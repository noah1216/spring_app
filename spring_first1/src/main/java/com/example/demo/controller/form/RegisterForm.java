package com.example.demo.controller.form;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class RegisterForm {
	@NotBlank
	private final String answer;

	@NotBlank
	private final String question;
}
