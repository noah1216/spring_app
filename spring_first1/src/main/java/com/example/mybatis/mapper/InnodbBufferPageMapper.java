package com.example.mybatis.mapper;

import com.example.domain.InnodbBufferPage;
import com.example.domain.InnodbBufferPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbBufferPageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbBufferPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbBufferPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbBufferPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbBufferPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbBufferPage> selectByExample(InnodbBufferPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_BUFFER_PAGE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbBufferPage record, @Param("example") InnodbBufferPageExample example);
}