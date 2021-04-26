package com.example.mybatis.mapper;

import com.example.domain.Orders;
import com.example.domain.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	long countByExample(OrdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByExample(OrdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insert(Orders record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int insertSelective(Orders record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	List<Orders> selectByExample(OrdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	Orders selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKeySelective(Orders record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table orders
	 * @mbg.generated  Mon Apr 26 16:23:14 JST 2021
	 */
	int updateByPrimaryKey(Orders record);
}