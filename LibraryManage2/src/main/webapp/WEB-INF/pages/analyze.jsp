<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>无常图书馆管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="<%=basePath%>lib/layui-v2.5.5/css/layui.css" media="all">
    <link rel="stylesheet" href="<%=basePath%>lib/font-awesome-4.7.0/css/font-awesome.min.css" media="all">
    <link rel="stylesheet" href="<%=basePath%>css/public.css" media="all">
    <style>

        .layui-card {border:1px solid #f2f2f2;border-radius:5px;width: 100%;height: 800px;}
        .icon {margin-right:10px;color:#1aa094;}
        .layuimini-qiuck-module a i {display:inline-block;width:100%;height:60px;line-height:60px;text-align:center;border-radius:2px;font-size:30px;background-color:#F8F8F8;color:#333;transition:all .3s;-webkit-transition:all .3s;}
        .layuimini-qiuck-module a cite {position:relative;top:2px;display:block;color:#666;text-overflow:ellipsis;overflow:hidden;white-space:nowrap;font-size:14px;}
        .main_btn > p {height:40px;}
    </style>
</head>
<body>
<div class="layui-row layui-col-space15" style="background:#acafb1;height: 800px;">
    <div   id="main" class="layui-card" style="width: 100%;min-height:700px;background:#c1d5eb; ">
        <div class="layui-card-header"><i class="fa fa-line-chart icon"></i>报表统计</div>

    </div >
</div>

<script src="<%=basePath%>lib/layui-v2.5.5/layui.js" charset="utf-8"></script>
<script src="<%=basePath%>js/lay-config.js?v=1.0.4" charset="utf-8"></script>
<script>
    layui.use(['layer', 'miniTab','echarts'], function () {
        var $ = layui.jquery,
            layer = layui.layer,
            miniTab = layui.miniTab,
            echarts = layui.echarts;


        layui.use(['echarts'], function () {
            var echarts = layui.echarts,
                $ = layui.jquery;
            console.log(echarts);
            // 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('main'));

            // 指定图表的配置项和数据
            var option = {
                series : [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius: '55%',
                        data:[
                            <c:forEach items="${list}" var="type">
                            {value:${type.counts}, name:'${type.name}'},
                            </c:forEach>
                            ,0
                        ],
                        roseType: 'angle',
                         itemStyle: {
                            /* normal: {
                                 shadowBlur: 200,
                                 shadowColor: 'rgba(0, 0, 0, 0.5)'
                             }*/
                         }
                    }
                ]
            };

            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        });
    });
</script>
</body>
</html>
