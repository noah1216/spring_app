package com.example.domain;

public class PrototypesWithBLOBs extends Prototypes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prototypes.catch_copy
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String catchCopy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column prototypes.concept
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String concept;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prototypes.catch_copy
     *
     * @return the value of prototypes.catch_copy
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getCatchCopy() {
        return catchCopy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prototypes.catch_copy
     *
     * @param catchCopy the value for prototypes.catch_copy
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCatchCopy(String catchCopy) {
        this.catchCopy = catchCopy == null ? null : catchCopy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column prototypes.concept
     *
     * @return the value of prototypes.concept
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getConcept() {
        return concept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column prototypes.concept
     *
     * @param concept the value for prototypes.concept
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setConcept(String concept) {
        this.concept = concept == null ? null : concept.trim();
    }
}