package com.example.mybatis.mapper;

import com.example.domain.PerformanceTimers;
import com.example.domain.PerformanceTimersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformanceTimersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(PerformanceTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(PerformanceTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(PerformanceTimers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(PerformanceTimers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<PerformanceTimers> selectByExample(PerformanceTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") PerformanceTimers record, @Param("example") PerformanceTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table performance_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") PerformanceTimers record, @Param("example") PerformanceTimersExample example);
}