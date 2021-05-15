package com.LibraryManage.service;

import com.LibraryManage.po.ClassInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ClassInfoService {
    /* 查询所有图书类型信息*/
    public PageInfo<ClassInfo> queryClassInfoAll(String name,int page,int limit);
    /*添加图书类型*/
    void addTypeSubmit(ClassInfo info);
    /*修改 根据id查询记录信息*/
    ClassInfo queryClassInfoById(Integer id);
    /*修改提交*/
    void updateTypeSubmit(ClassInfo info);
    /*根据id删除记录信息*/
    void deleteTypeByIds(List<String> id);
}
