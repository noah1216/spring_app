package com.example.domain;

import java.util.Date;

public class Shifts {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shifts.id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shifts.date
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shifts.start_time
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shifts.user_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shifts.created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shifts.updated_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date updatedAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shifts.id
     *
     * @return the value of shifts.id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shifts.id
     *
     * @param id the value for shifts.id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shifts.date
     *
     * @return the value of shifts.date
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shifts.date
     *
     * @param date the value for shifts.date
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shifts.start_time
     *
     * @return the value of shifts.start_time
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shifts.start_time
     *
     * @param startTime the value for shifts.start_time
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shifts.user_id
     *
     * @return the value of shifts.user_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shifts.user_id
     *
     * @param userId the value for shifts.user_id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shifts.created_at
     *
     * @return the value of shifts.created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shifts.created_at
     *
     * @param createdAt the value for shifts.created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shifts.updated_at
     *
     * @return the value of shifts.updated_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shifts.updated_at
     *
     * @param updatedAt the value for shifts.updated_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}