package com.example.mybatis.mapper;

import com.example.domain.EventsStagesSummaryByAccountByEventName;
import com.example.domain.EventsStagesSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(EventsStagesSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(EventsStagesSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<EventsStagesSummaryByAccountByEventName> selectByExample(EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") EventsStagesSummaryByAccountByEventName record, @Param("example") EventsStagesSummaryByAccountByEventNameExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") EventsStagesSummaryByAccountByEventName record, @Param("example") EventsStagesSummaryByAccountByEventNameExample example);
}