package com.example.domain;

import java.util.Date;

public class Admins {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.email
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.encrypted_password
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String encryptedPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.nickname
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.family_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String familyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.first_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.family_n_k
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String familyNK;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.first_n_k
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String firstNK;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.reset_password_token
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String resetPasswordToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.reset_password_sent_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date resetPasswordSentAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.remember_created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date rememberCreatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.updated_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Date updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.text
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String text;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.id
     *
     * @return the value of admins.id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.id
     *
     * @param id the value for admins.id
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.email
     *
     * @return the value of admins.email
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.email
     *
     * @param email the value for admins.email
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.encrypted_password
     *
     * @return the value of admins.encrypted_password
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.encrypted_password
     *
     * @param encryptedPassword the value for admins.encrypted_password
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword == null ? null : encryptedPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.nickname
     *
     * @return the value of admins.nickname
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.nickname
     *
     * @param nickname the value for admins.nickname
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.family_name
     *
     * @return the value of admins.family_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.family_name
     *
     * @param familyName the value for admins.family_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.first_name
     *
     * @return the value of admins.first_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.first_name
     *
     * @param firstName the value for admins.first_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.family_n_k
     *
     * @return the value of admins.family_n_k
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getFamilyNK() {
        return familyNK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.family_n_k
     *
     * @param familyNK the value for admins.family_n_k
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setFamilyNK(String familyNK) {
        this.familyNK = familyNK == null ? null : familyNK.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.first_n_k
     *
     * @return the value of admins.first_n_k
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getFirstNK() {
        return firstNK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.first_n_k
     *
     * @param firstNK the value for admins.first_n_k
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setFirstNK(String firstNK) {
        this.firstNK = firstNK == null ? null : firstNK.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.reset_password_token
     *
     * @return the value of admins.reset_password_token
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.reset_password_token
     *
     * @param resetPasswordToken the value for admins.reset_password_token
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken == null ? null : resetPasswordToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.reset_password_sent_at
     *
     * @return the value of admins.reset_password_sent_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getResetPasswordSentAt() {
        return resetPasswordSentAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.reset_password_sent_at
     *
     * @param resetPasswordSentAt the value for admins.reset_password_sent_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setResetPasswordSentAt(Date resetPasswordSentAt) {
        this.resetPasswordSentAt = resetPasswordSentAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.remember_created_at
     *
     * @return the value of admins.remember_created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getRememberCreatedAt() {
        return rememberCreatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.remember_created_at
     *
     * @param rememberCreatedAt the value for admins.remember_created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setRememberCreatedAt(Date rememberCreatedAt) {
        this.rememberCreatedAt = rememberCreatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.created_at
     *
     * @return the value of admins.created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.created_at
     *
     * @param createdAt the value for admins.created_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.updated_at
     *
     * @return the value of admins.updated_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.updated_at
     *
     * @param updatedAt the value for admins.updated_at
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.text
     *
     * @return the value of admins.text
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.text
     *
     * @param text the value for admins.text
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}