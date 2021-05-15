package com.LibraryManage.dao;

import com.LibraryManage.po.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("adminDao")
public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKey(Admin record);
    //管理员查询
    List<Admin> queryAdminInfoAll(Admin admin);
    //根据用户名和密码查询用户信息
    Admin queryUserByNameAndPassword(@Param("username") String username, @Param("password")  String password);
}