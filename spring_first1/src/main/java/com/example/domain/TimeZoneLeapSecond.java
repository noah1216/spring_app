package com.example.domain;

public class TimeZoneLeapSecond {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_leap_second.Transition_time
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long transitionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_leap_second.Correction
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Integer correction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_leap_second.Transition_time
     *
     * @return the value of time_zone_leap_second.Transition_time
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getTransitionTime() {
        return transitionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_leap_second.Transition_time
     *
     * @param transitionTime the value for time_zone_leap_second.Transition_time
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_leap_second.Correction
     *
     * @return the value of time_zone_leap_second.Correction
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Integer getCorrection() {
        return correction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_leap_second.Correction
     *
     * @param correction the value for time_zone_leap_second.Correction
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCorrection(Integer correction) {
        this.correction = correction;
    }
}