package com.example.mybatis.mapper;

import com.example.domain.InnodbFtIndexCache;
import com.example.domain.InnodbFtIndexCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbFtIndexCacheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    long countByExample(InnodbFtIndexCacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int deleteByExample(InnodbFtIndexCacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insert(InnodbFtIndexCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int insertSelective(InnodbFtIndexCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    List<InnodbFtIndexCache> selectByExample(InnodbFtIndexCacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExampleSelective(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated Mon Apr 26 16:23:14 JST 2021
     */
    int updateByExample(@Param("record") InnodbFtIndexCache record, @Param("example") InnodbFtIndexCacheExample example);
}