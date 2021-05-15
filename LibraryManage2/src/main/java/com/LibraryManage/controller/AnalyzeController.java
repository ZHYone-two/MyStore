package com.LibraryManage.controller;

import com.LibraryManage.po.BookInfo;
import com.LibraryManage.po.Notice;
import com.LibraryManage.service.BookInfoService;
import com.LibraryManage.service.NoticeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AnalyzeController{

    @Autowired
    private BookInfoService bookInfoService;
    //统计分析页面
    @RequestMapping("/analyze")
    public String analyze(Model model)
    {
        //根据图书类型查询图书数量
        List<BookInfo> list=bookInfoService.getBookCountByType();
        model.addAttribute("list",list);
        return "/analyze";
    }
}
