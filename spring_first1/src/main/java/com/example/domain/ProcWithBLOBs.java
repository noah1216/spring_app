package com.example.domain;

public class ProcWithBLOBs extends Proc {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proc.param_list
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private byte[] paramList;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proc.returns
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private byte[] returns;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proc.body
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private byte[] body;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proc.comment
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proc.body_utf8
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private byte[] bodyUtf8;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proc.param_list
     *
     * @return the value of proc.param_list
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public byte[] getParamList() {
        return paramList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proc.param_list
     *
     * @param paramList the value for proc.param_list
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setParamList(byte[] paramList) {
        this.paramList = paramList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proc.returns
     *
     * @return the value of proc.returns
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public byte[] getReturns() {
        return returns;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proc.returns
     *
     * @param returns the value for proc.returns
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setReturns(byte[] returns) {
        this.returns = returns;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proc.body
     *
     * @return the value of proc.body
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public byte[] getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proc.body
     *
     * @param body the value for proc.body
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setBody(byte[] body) {
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proc.comment
     *
     * @return the value of proc.comment
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proc.comment
     *
     * @param comment the value for proc.comment
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proc.body_utf8
     *
     * @return the value of proc.body_utf8
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public byte[] getBodyUtf8() {
        return bodyUtf8;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proc.body_utf8
     *
     * @param bodyUtf8 the value for proc.body_utf8
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }
}