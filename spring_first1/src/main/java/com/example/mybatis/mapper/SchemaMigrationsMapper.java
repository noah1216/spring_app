package com.example.mybatis.mapper;

import com.example.domain.SchemaMigrations;
import com.example.domain.SchemaMigrationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaMigrationsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	long countByExample(SchemaMigrationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByExample(SchemaMigrationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByPrimaryKey(String version);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insert(SchemaMigrations record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insertSelective(SchemaMigrations record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	List<SchemaMigrations> selectByExample(SchemaMigrationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExampleSelective(@Param("record") SchemaMigrations record,
			@Param("example") SchemaMigrationsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table schema_migrations
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExample(@Param("record") SchemaMigrations record, @Param("example") SchemaMigrationsExample example);
}