package com.example.mybatis.mapper;

import com.example.domain.InnodbIndexStats;
import com.example.domain.InnodbIndexStatsExample;
import com.example.domain.InnodbIndexStatsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByPrimaryKey(InnodbIndexStatsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbIndexStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbIndexStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbIndexStats> selectByExample(InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    InnodbIndexStats selectByPrimaryKey(InnodbIndexStatsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbIndexStats record, @Param("example") InnodbIndexStatsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKeySelective(InnodbIndexStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKey(InnodbIndexStats record);
}