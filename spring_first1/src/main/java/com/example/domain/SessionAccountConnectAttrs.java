package com.example.domain;

public class SessionAccountConnectAttrs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session_account_connect_attrs.PROCESSLIST_ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer processlistId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session_account_connect_attrs.ATTR_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String attrName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session_account_connect_attrs.ATTR_VALUE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String attrValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session_account_connect_attrs.ORDINAL_POSITION
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer ordinalPosition;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session_account_connect_attrs.PROCESSLIST_ID
     *
     * @return the value of session_account_connect_attrs.PROCESSLIST_ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getProcesslistId() {
        return processlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session_account_connect_attrs.PROCESSLIST_ID
     *
     * @param processlistId the value for session_account_connect_attrs.PROCESSLIST_ID
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setProcesslistId(Integer processlistId) {
        this.processlistId = processlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session_account_connect_attrs.ATTR_NAME
     *
     * @return the value of session_account_connect_attrs.ATTR_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session_account_connect_attrs.ATTR_NAME
     *
     * @param attrName the value for session_account_connect_attrs.ATTR_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session_account_connect_attrs.ATTR_VALUE
     *
     * @return the value of session_account_connect_attrs.ATTR_VALUE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session_account_connect_attrs.ATTR_VALUE
     *
     * @param attrValue the value for session_account_connect_attrs.ATTR_VALUE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session_account_connect_attrs.ORDINAL_POSITION
     *
     * @return the value of session_account_connect_attrs.ORDINAL_POSITION
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session_account_connect_attrs.ORDINAL_POSITION
     *
     * @param ordinalPosition the value for session_account_connect_attrs.ORDINAL_POSITION
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }
}