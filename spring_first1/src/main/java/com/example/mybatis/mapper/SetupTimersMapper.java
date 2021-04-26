package com.example.mybatis.mapper;

import com.example.domain.SetupTimers;
import com.example.domain.SetupTimersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupTimersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(SetupTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(SetupTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(SetupTimers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(SetupTimers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<SetupTimers> selectByExample(SetupTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") SetupTimers record, @Param("example") SetupTimersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_timers
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") SetupTimers record, @Param("example") SetupTimersExample example);
}