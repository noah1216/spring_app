package com.example.mybatis.mapper;

import com.example.domain.Tweets;
import com.example.domain.TweetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TweetsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	long countByExample(TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByExample(TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insert(Tweets record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insertSelective(Tweets record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	List<Tweets> selectByExampleWithBLOBs(TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	List<Tweets> selectByExample(TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	Tweets selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExampleSelective(@Param("record") Tweets record, @Param("example") TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExampleWithBLOBs(@Param("record") Tweets record, @Param("example") TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExample(@Param("record") Tweets record, @Param("example") TweetsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKeySelective(Tweets record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKeyWithBLOBs(Tweets record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tweets
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKey(Tweets record);
}