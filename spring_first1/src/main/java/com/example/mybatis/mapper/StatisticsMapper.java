package com.example.mybatis.mapper;

import com.example.domain.Statistics;
import com.example.domain.StatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(StatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(StatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(Statistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(Statistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<Statistics> selectByExample(StatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") Statistics record, @Param("example") StatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATISTICS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") Statistics record, @Param("example") StatisticsExample example);
}