package com.example.mybatis.mapper;

import com.example.domain.InnodbSysColumns;
import com.example.domain.InnodbSysColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbSysColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbSysColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbSysColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbSysColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbSysColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbSysColumns> selectByExample(InnodbSysColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbSysColumns record, @Param("example") InnodbSysColumnsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_SYS_COLUMNS
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbSysColumns record, @Param("example") InnodbSysColumnsExample example);
}