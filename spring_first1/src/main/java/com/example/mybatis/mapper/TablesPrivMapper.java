package com.example.mybatis.mapper;

import com.example.domain.TablesPriv;
import com.example.domain.TablesPrivExample;
import com.example.domain.TablesPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TablesPrivMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(TablesPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(TablesPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByPrimaryKey(TablesPrivKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(TablesPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(TablesPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<TablesPriv> selectByExample(TablesPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    TablesPriv selectByPrimaryKey(TablesPrivKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") TablesPriv record, @Param("example") TablesPrivExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKeySelective(TablesPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tables_priv
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKey(TablesPriv record);
}