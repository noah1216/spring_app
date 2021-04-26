package com.example.mybatis.mapper;

import com.example.domain.InnodbTableStats;
import com.example.domain.InnodbTableStatsExample;
import com.example.domain.InnodbTableStatsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTableStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbTableStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbTableStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByPrimaryKey(InnodbTableStatsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbTableStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbTableStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbTableStats> selectByExample(InnodbTableStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    InnodbTableStats selectByPrimaryKey(InnodbTableStatsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbTableStats record, @Param("example") InnodbTableStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKeySelective(InnodbTableStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_table_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKey(InnodbTableStats record);
}