package com.LibraryManage.service;

import com.LibraryManage.po.Admin;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("adminService")
public interface AdminService {
    //分页查询
    PageInfo<Admin> queryAdminInfoAll(Admin admin, int page , int limit);

    //添加
    int addAdminSubmit(Admin admin);

    //修改
    int updateAdminSubmit(Admin admin);

    //删除
    int deleteAdminByIds(List<String> ids);

    //根据id查询详细信息
    Admin queryAdminById(Integer id);

    //根据用户名和密码查询用户信息
    Admin queryUserByNameAndPassword( String username, String password);


}
