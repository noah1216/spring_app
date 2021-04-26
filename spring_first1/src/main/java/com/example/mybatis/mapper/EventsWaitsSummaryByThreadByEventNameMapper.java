package com.example.mybatis.mapper;

import com.example.domain.EventsWaitsSummaryByThreadByEventName;
import com.example.domain.EventsWaitsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByThreadByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(EventsWaitsSummaryByThreadByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(EventsWaitsSummaryByThreadByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<EventsWaitsSummaryByThreadByEventName> selectByExample(EventsWaitsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_thread_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") EventsWaitsSummaryByThreadByEventName record, @Param("example") EventsWaitsSummaryByThreadByEventNameExample example);
}