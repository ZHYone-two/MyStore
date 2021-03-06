package com.LibraryManage.dao;

import com.LibraryManage.po.Admin;
import com.LibraryManage.po.ReaderCard;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("readerDao")
public interface ReaderCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_card
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_card
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int insert(ReaderCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_card
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int insertSelective(ReaderCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_card
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    ReaderCard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_card
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(ReaderCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader_card
     *
     * @mbggenerated Fri Jan 29 23:28:51 GMT+08:00 2021
     */
    int updateByPrimaryKey(ReaderCard record);
    //查询所有的记录信息
    List<ReaderCard> queryReaderListAll(ReaderCard readerCard);
    //根据用户名和密码判断用户是否存在
    ReaderCard queryUserInfoByNameAndPassword(@Param("username") String username, @Param("password")String password);

}