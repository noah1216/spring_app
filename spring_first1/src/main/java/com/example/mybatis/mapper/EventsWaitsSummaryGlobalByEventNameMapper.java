package com.example.mybatis.mapper;

import com.example.domain.EventsWaitsSummaryGlobalByEventName;
import com.example.domain.EventsWaitsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryGlobalByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(EventsWaitsSummaryGlobalByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(EventsWaitsSummaryGlobalByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<EventsWaitsSummaryGlobalByEventName> selectByExample(EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_global_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") EventsWaitsSummaryGlobalByEventName record, @Param("example") EventsWaitsSummaryGlobalByEventNameExample example);
}