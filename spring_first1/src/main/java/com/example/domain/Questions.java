package com.example.domain;

import java.util.Date;

public class Questions {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column questions.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column questions.question
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private String question;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column questions.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column questions.updated_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Date updatedAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column questions.id
	 * @return  the value of questions.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column questions.id
	 * @param id  the value for questions.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column questions.question
	 * @return  the value of questions.question
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column questions.question
	 * @param question  the value for questions.question
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setQuestion(String question) {
		this.question = question == null ? null : question.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column questions.created_at
	 * @return  the value of questions.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column questions.created_at
	 * @param createdAt  the value for questions.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column questions.updated_at
	 * @return  the value of questions.updated_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column questions.updated_at
	 * @param updatedAt  the value for questions.updated_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}