package com.LibraryManage.controller;

import com.LibraryManage.po.Admin;
import com.LibraryManage.po.ReaderCard;
import com.LibraryManage.service.AdminService;
import com.LibraryManage.service.ReaderService;
import com.LibraryManage.util.R;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.io.Reader;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class ReaderController {
    @Autowired
    private ReaderService readerService;

    //查询菜单的映射
    @GetMapping("/readerIndex")
    public String readerIndex(){
        return "/reader/readerIndex";
    }

    @GetMapping("/addReader")
    public String addReader(){
        return "/reader/addReader";
    }

    @GetMapping("/readerIndex2")
    public String readerIndex2(){
        return "/reader/readerIndex2";
    }

    //查询所有的读者信息
    @ResponseBody
    @RequestMapping("/queryReaderAll")
    public R queryReaderAll(ReaderCard info, @RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "15") Integer limit){

        PageInfo<ReaderCard> pageInfo=readerService.queryReaderAll(info,page,limit);
        return R.ok("成功",pageInfo.getTotal(),pageInfo.getList());
    }
    //提交添加功能
    @ResponseBody
    @RequestMapping("/addReaderSubmit")
    public R addReaderSubmit(@RequestBody ReaderCard info){
        //设置默认密码
        info.setPassword("123456");
        info.setCreatDate(new Date());
        readerService.addReaderInfoSubmit(info);
        return R.ok();
    }

    @ResponseBody
    @RequestMapping("/deleteReader")
    public R deleteReaderByIds(String ids){
        List list= Arrays.asList(ids.split(","));
        readerService.deleteReaderByIds(list);
        return R.ok();
    }
    //根据id查询详细的读者信息
    @GetMapping("/queryReaderInfoById")
    public String queryReaderInfoById(Integer id, Model model){
        //根据id查询具体的读者信息
        ReaderCard readerCard=readerService.queryReaderById(id);
        model.addAttribute("info",readerCard);
        return "/reader/updateReader";
    }
    //修改提交功能
    @ResponseBody
    @RequestMapping("/updateReaderSubmit")
    public R updateReaderSubmit(@RequestBody ReaderCard readerCard){
        readerService.updateReaderInfoSubmit(readerCard);
        return R.ok();
    }
    //密码的修改
    @ResponseBody
    @RequestMapping("/updatePwdSubmit")
    public R  queryUserInfoByNameAndPassword(Integer id,String oldPwd,String newPwd){
        //根据id查询对象
        ReaderCard info=readerService.queryReaderById(id);
        if(!oldPwd.equals(info.getPassword())){//输入的密码是否和原密码一致
            return R.fail("输入的旧密码和原来不一致");
        }else{

            info.setPassword(newPwd);
            /*info.setType(info.getType());*/
            info.setUsername(info.getUsername());
            info.setId(id);
            readerService.updateReaderInfoSubmit(info);
            return R.ok("修改密码成功");
        }
    }

}
