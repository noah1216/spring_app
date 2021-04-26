package com.example.mybatis.mapper;

import com.example.domain.SetupObjects;
import com.example.domain.SetupObjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupObjectsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(SetupObjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(SetupObjects record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<SetupObjects> selectByExample(SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") SetupObjects record, @Param("example") SetupObjectsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_objects
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") SetupObjects record, @Param("example") SetupObjectsExample example);
}