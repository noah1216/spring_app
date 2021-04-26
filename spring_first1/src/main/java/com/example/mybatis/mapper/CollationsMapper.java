package com.example.mybatis.mapper;

import com.example.domain.Collations;
import com.example.domain.CollationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(CollationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(CollationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(Collations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(Collations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<Collations> selectByExample(CollationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") Collations record, @Param("example") CollationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") Collations record, @Param("example") CollationsExample example);
}