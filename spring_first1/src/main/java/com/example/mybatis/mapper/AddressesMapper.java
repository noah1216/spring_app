package com.example.mybatis.mapper;

import com.example.domain.Addresses;
import com.example.domain.AddressesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	long countByExample(AddressesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByExample(AddressesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insert(Addresses record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insertSelective(Addresses record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	List<Addresses> selectByExample(AddressesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	Addresses selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExampleSelective(@Param("record") Addresses record, @Param("example") AddressesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExample(@Param("record") Addresses record, @Param("example") AddressesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKeySelective(Addresses record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table addresses
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKey(Addresses record);
}