package com.example.mybatis.mapper;

import com.example.domain.RwlockInstances;
import com.example.domain.RwlockInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RwlockInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(RwlockInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(RwlockInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<RwlockInstances> selectByExample(RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);
}