package com.crm.mapper;

import com.crm.entity.CustomerContact;
import com.crm.entity.CustomerContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerContactMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	long countByExample(CustomerContactExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int deleteByExample(CustomerContactExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int deleteByPrimaryKey(Integer cusconId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int insert(CustomerContact record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int insertSelective(CustomerContact record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	List<CustomerContact> selectByExample(CustomerContactExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	CustomerContact selectByPrimaryKey(Integer cusconId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int updateByExampleSelective(@Param("record") CustomerContact record,
			@Param("example") CustomerContactExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int updateByExample(@Param("record") CustomerContact record, @Param("example") CustomerContactExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int updateByPrimaryKeySelective(CustomerContact record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customer_contact
	 * @mbg.generated  Mon May 04 13:49:33 CST 2020
	 */
	int updateByPrimaryKey(CustomerContact record);

	/**
     *
     */
    List<CustomerContact> selectContactAndCustomer();
}