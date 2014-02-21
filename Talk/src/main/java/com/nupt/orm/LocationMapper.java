package com.nupt.orm;

import com.nupt.domain.Location;
import com.nupt.domain.LocationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LocationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int countByExample(LocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int deleteByExample(LocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int insert(Location record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int insertSelective(Location record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    List<Location> selectByExample(LocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    Location selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int updateByExampleSelective(@Param("record") Location record, @Param("example") LocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int updateByExample(@Param("record") Location record, @Param("example") LocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int updateByPrimaryKeySelective(Location record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated Sat Dec 14 19:53:58 CST 2013
     */
    int updateByPrimaryKey(Location record);


    /*自定义函数*/
    List<Map> queryLocationByMap(Map map);

    int queryLastInsertId();
}