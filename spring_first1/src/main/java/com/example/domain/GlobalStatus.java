package com.example.domain;

public class GlobalStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GLOBAL_STATUS.VARIABLE_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String variableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GLOBAL_STATUS.VARIABLE_VALUE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String variableValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GLOBAL_STATUS.VARIABLE_NAME
     *
     * @return the value of GLOBAL_STATUS.VARIABLE_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GLOBAL_STATUS.VARIABLE_NAME
     *
     * @param variableName the value for GLOBAL_STATUS.VARIABLE_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setVariableName(String variableName) {
        this.variableName = variableName == null ? null : variableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GLOBAL_STATUS.VARIABLE_VALUE
     *
     * @return the value of GLOBAL_STATUS.VARIABLE_VALUE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GLOBAL_STATUS.VARIABLE_VALUE
     *
     * @param variableValue the value for GLOBAL_STATUS.VARIABLE_VALUE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue == null ? null : variableValue.trim();
    }
}