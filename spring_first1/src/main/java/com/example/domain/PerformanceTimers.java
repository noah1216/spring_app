package com.example.domain;

public class PerformanceTimers {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_timers.TIMER_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String timerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_timers.TIMER_FREQUENCY
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long timerFrequency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_timers.TIMER_RESOLUTION
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long timerResolution;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column performance_timers.TIMER_OVERHEAD
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long timerOverhead;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_timers.TIMER_NAME
     *
     * @return the value of performance_timers.TIMER_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getTimerName() {
        return timerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_timers.TIMER_NAME
     *
     * @param timerName the value for performance_timers.TIMER_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTimerName(String timerName) {
        this.timerName = timerName == null ? null : timerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_timers.TIMER_FREQUENCY
     *
     * @return the value of performance_timers.TIMER_FREQUENCY
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getTimerFrequency() {
        return timerFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_timers.TIMER_FREQUENCY
     *
     * @param timerFrequency the value for performance_timers.TIMER_FREQUENCY
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTimerFrequency(Long timerFrequency) {
        this.timerFrequency = timerFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_timers.TIMER_RESOLUTION
     *
     * @return the value of performance_timers.TIMER_RESOLUTION
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getTimerResolution() {
        return timerResolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_timers.TIMER_RESOLUTION
     *
     * @param timerResolution the value for performance_timers.TIMER_RESOLUTION
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTimerResolution(Long timerResolution) {
        this.timerResolution = timerResolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column performance_timers.TIMER_OVERHEAD
     *
     * @return the value of performance_timers.TIMER_OVERHEAD
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getTimerOverhead() {
        return timerOverhead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column performance_timers.TIMER_OVERHEAD
     *
     * @param timerOverhead the value for performance_timers.TIMER_OVERHEAD
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setTimerOverhead(Long timerOverhead) {
        this.timerOverhead = timerOverhead;
    }
}