package com.LibraryManage.dao;

import com.LibraryManage.po.BookInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("bookinfoDao")
public interface BookInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int insert(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int insertSelective(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    BookInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKeyWithBLOBs(BookInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_info
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKey(BookInfo record);
    //查询所有的图书信息
    List<BookInfo> queryBookInfoAll(BookInfo info);
    //根据图书的类型获取图书的数量
    List<BookInfo> getBookCountByType();
}