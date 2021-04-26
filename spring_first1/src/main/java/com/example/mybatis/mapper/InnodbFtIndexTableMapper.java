package com.example.mybatis.mapper;

import com.example.domain.InnodbFtIndexTable;
import com.example.domain.InnodbFtIndexTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtIndexTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbFtIndexTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbFtIndexTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbFtIndexTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbFtIndexTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbFtIndexTable> selectByExample(InnodbFtIndexTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbFtIndexTable record, @Param("example") InnodbFtIndexTableExample example);
}