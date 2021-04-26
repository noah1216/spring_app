package com.example.mybatis.mapper;

import com.example.domain.Triggers;
import com.example.domain.TriggersExample;
import com.example.domain.TriggersWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(TriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(TriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(TriggersWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(TriggersWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<TriggersWithBLOBs> selectByExampleWithBLOBs(TriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<Triggers> selectByExample(TriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") TriggersWithBLOBs record, @Param("example") TriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") Triggers record, @Param("example") TriggersExample example);
}