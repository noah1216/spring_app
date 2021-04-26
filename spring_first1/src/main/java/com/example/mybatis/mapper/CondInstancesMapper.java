package com.example.mybatis.mapper;

import com.example.domain.CondInstances;
import com.example.domain.CondInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(CondInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(CondInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(CondInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(CondInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<CondInstances> selectByExample(CondInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);
}