package com.example.mybatis.mapper;

import com.example.domain.ProcsPriv;
import com.example.domain.ProcsPrivExample;
import com.example.domain.ProcsPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(ProcsPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(ProcsPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByPrimaryKey(ProcsPrivKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(ProcsPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(ProcsPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<ProcsPriv> selectByExample(ProcsPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") ProcsPriv record, @Param("example") ProcsPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKeySelective(ProcsPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKey(ProcsPriv record);
}