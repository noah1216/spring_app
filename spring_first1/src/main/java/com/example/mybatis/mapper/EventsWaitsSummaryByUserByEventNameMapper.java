package com.example.mybatis.mapper;

import com.example.domain.EventsWaitsSummaryByUserByEventName;
import com.example.domain.EventsWaitsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(EventsWaitsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(EventsWaitsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(EventsWaitsSummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(EventsWaitsSummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<EventsWaitsSummaryByUserByEventName> selectByExample(EventsWaitsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByUserByEventName record, @Param("example") EventsWaitsSummaryByUserByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") EventsWaitsSummaryByUserByEventName record, @Param("example") EventsWaitsSummaryByUserByEventNameExample example);
}