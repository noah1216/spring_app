package com.example.mybatis.mapper;

import com.example.domain.NdbBinlogIndex;
import com.example.domain.NdbBinlogIndexExample;
import com.example.domain.NdbBinlogIndexKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NdbBinlogIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(NdbBinlogIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(NdbBinlogIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByPrimaryKey(NdbBinlogIndexKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(NdbBinlogIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(NdbBinlogIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<NdbBinlogIndex> selectByExample(NdbBinlogIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    NdbBinlogIndex selectByPrimaryKey(NdbBinlogIndexKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") NdbBinlogIndex record, @Param("example") NdbBinlogIndexExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKeySelective(NdbBinlogIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ndb_binlog_index
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByPrimaryKey(NdbBinlogIndex record);
}