package com.example.mybatis.mapper;

import com.example.domain.ArInternalMetadata;
import com.example.domain.ArInternalMetadataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArInternalMetadataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	long countByExample(ArInternalMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByExample(ArInternalMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByPrimaryKey(String key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insert(ArInternalMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insertSelective(ArInternalMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	List<ArInternalMetadata> selectByExample(ArInternalMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	ArInternalMetadata selectByPrimaryKey(String key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExampleSelective(@Param("record") ArInternalMetadata record,
			@Param("example") ArInternalMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExample(@Param("record") ArInternalMetadata record,
			@Param("example") ArInternalMetadataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKeySelective(ArInternalMetadata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ar_internal_metadata
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKey(ArInternalMetadata record);
}