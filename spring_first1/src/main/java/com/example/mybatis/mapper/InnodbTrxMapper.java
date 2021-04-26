package com.example.mybatis.mapper;

import com.example.domain.InnodbTrx;
import com.example.domain.InnodbTrxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbTrxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbTrx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbTrx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbTrx> selectByExample(InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TRX
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbTrx record, @Param("example") InnodbTrxExample example);
}