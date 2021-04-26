package com.example.mybatis.mapper;

import com.example.domain.ObjectsSummaryGlobalByType;
import com.example.domain.ObjectsSummaryGlobalByTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ObjectsSummaryGlobalByTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(ObjectsSummaryGlobalByTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(ObjectsSummaryGlobalByTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(ObjectsSummaryGlobalByType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(ObjectsSummaryGlobalByType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<ObjectsSummaryGlobalByType> selectByExample(ObjectsSummaryGlobalByTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") ObjectsSummaryGlobalByType record, @Param("example") ObjectsSummaryGlobalByTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table objects_summary_global_by_type
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") ObjectsSummaryGlobalByType record, @Param("example") ObjectsSummaryGlobalByTypeExample example);
}