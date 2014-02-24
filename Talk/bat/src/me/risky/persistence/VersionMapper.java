package me.risky.persistence;

import java.util.List;
import me.risky.domain.Version;
import me.risky.domain.VersionExample;
import org.apache.ibatis.annotations.Param;

public interface VersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int countByExample(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int deleteByExample(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int insert(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int insertSelective(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    List<Version> selectByExample(VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    Version selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int updateByExampleSelective(@Param("record") Version record, @Param("example") VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int updateByExample(@Param("record") Version record, @Param("example") VersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int updateByPrimaryKeySelective(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbggenerated Mon Feb 24 09:12:16 CST 2014
     */
    int updateByPrimaryKey(Version record);
}