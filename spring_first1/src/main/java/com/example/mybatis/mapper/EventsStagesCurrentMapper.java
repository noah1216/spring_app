package com.example.mybatis.mapper;

import com.example.domain.EventsStagesCurrent;
import com.example.domain.EventsStagesCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesCurrentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(EventsStagesCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(EventsStagesCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(EventsStagesCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(EventsStagesCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<EventsStagesCurrent> selectByExample(EventsStagesCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_current
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);
}