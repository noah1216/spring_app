package com.example.demo.controller.form;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class UpdateForm {
	@NotBlank
	private final String answer;

	private final String answerId;

	private final String[] answerIds;

	@NotBlank
	private final String question;

	private final String questionId;
}
