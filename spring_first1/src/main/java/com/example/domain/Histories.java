package com.example.domain;

import java.util.Date;

public class Histories {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column histories.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column histories.users_id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Integer usersId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column histories.point
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Integer point;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column histories.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	private Date createdAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column histories.id
	 * @return  the value of histories.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column histories.id
	 * @param id  the value for histories.id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column histories.users_id
	 * @return  the value of histories.users_id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Integer getUsersId() {
		return usersId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column histories.users_id
	 * @param usersId  the value for histories.users_id
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setUsersId(Integer usersId) {
		this.usersId = usersId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column histories.point
	 * @return  the value of histories.point
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Integer getPoint() {
		return point;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column histories.point
	 * @param point  the value for histories.point
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setPoint(Integer point) {
		this.point = point;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column histories.created_at
	 * @return  the value of histories.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column histories.created_at
	 * @param createdAt  the value for histories.created_at
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}