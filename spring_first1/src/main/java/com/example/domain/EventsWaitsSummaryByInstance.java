package com.example.domain;

public class EventsWaitsSummaryByInstance {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.EVENT_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private String eventName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long objectInstanceBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.COUNT_STAR
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long countStar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.SUM_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long sumTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.MIN_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long minTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.AVG_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long avgTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_instance.MAX_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    private Long maxTimerWait;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.EVENT_NAME
     *
     * @return the value of events_waits_summary_by_instance.EVENT_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.EVENT_NAME
     *
     * @param eventName the value for events_waits_summary_by_instance.EVENT_NAME
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN
     *
     * @return the value of events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN
     *
     * @param objectInstanceBegin the value for events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.COUNT_STAR
     *
     * @return the value of events_waits_summary_by_instance.COUNT_STAR
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.COUNT_STAR
     *
     * @param countStar the value for events_waits_summary_by_instance.COUNT_STAR
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.SUM_TIMER_WAIT
     *
     * @return the value of events_waits_summary_by_instance.SUM_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.SUM_TIMER_WAIT
     *
     * @param sumTimerWait the value for events_waits_summary_by_instance.SUM_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.MIN_TIMER_WAIT
     *
     * @return the value of events_waits_summary_by_instance.MIN_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.MIN_TIMER_WAIT
     *
     * @param minTimerWait the value for events_waits_summary_by_instance.MIN_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.AVG_TIMER_WAIT
     *
     * @return the value of events_waits_summary_by_instance.AVG_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.AVG_TIMER_WAIT
     *
     * @param avgTimerWait the value for events_waits_summary_by_instance.AVG_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_instance.MAX_TIMER_WAIT
     *
     * @return the value of events_waits_summary_by_instance.MAX_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_instance.MAX_TIMER_WAIT
     *
     * @param maxTimerWait the value for events_waits_summary_by_instance.MAX_TIMER_WAIT
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }
}