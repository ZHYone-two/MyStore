/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-02-10 08:58:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dsetting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>读者管理</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("lib/layui-v2.5.5/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/public.css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layuimini-container\">\r\n");
      out.write("    <div class=\"layuimini-main\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"layuimini-main\">\r\n");
      out.write("            <div class=\"demoTable\">\r\n");
      out.write("                <div class=\"layui-form-item layui-form \">\r\n");
      out.write("                    卡号\r\n");
      out.write("                    <div class=\"layui-inline\">\r\n");
      out.write("                        <input class=\"layui-input\" name=\"cardNumber\" id=\"cardNumber\" autocomplete=\"off\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    用户名\r\n");
      out.write("                    <div class=\"layui-inline\">\r\n");
      out.write("                        <input class=\"layui-input\" name=\"username\" id=\"username\" autocomplete=\"off\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    电话\r\n");
      out.write("                    <div class=\"layui-inline\">\r\n");
      out.write("                        <input class=\"layui-input\" name=\"tel\" id=\"tel\" autocomplete=\"off\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button class=\"layui-btn\" data-type=\"reload\">高级查询</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table class=\"layui-hide\" id=\"currentTableId\" lay-filter=\"currentTableFilter\"></table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("lib/layui-v2.5.5/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form', 'table'], function () {\r\n");
      out.write("        var $ = layui.jquery,\r\n");
      out.write("            form = layui.form,\r\n");
      out.write("            table = layui.table;\r\n");
      out.write("\r\n");
      out.write("        table.render({\r\n");
      out.write("            elem: '#currentTableId',\r\n");
      out.write("            url: '");
      out.print(basePath);
      out.write("queryReaderAll',//查询图书数据\r\n");
      out.write("            toolbar: '#toolbarDemo',\r\n");
      out.write("            defaultToolbar: ['filter', 'exports', 'print', {\r\n");
      out.write("                title: '提示',\r\n");
      out.write("                layEvent: 'LAYTABLE_TIPS',\r\n");
      out.write("                icon: 'layui-icon-tips'\r\n");
      out.write("            }],\r\n");
      out.write("            cols: [[\r\n");
      out.write("                //{type: \"checkbox\", width: 50},\r\n");
      out.write("                /*                {field: 'id', width: 100, title: 'ID', sort: true},*/\r\n");
      out.write("                {field: 'cardnumber', width: 180, title: '卡号'},\r\n");
      out.write("                {field: 'username', width: 110, title: '用户名'},\r\n");
      out.write("                {field: 'name', width: 110, title: '真实姓名'},\r\n");
      out.write("                {field: 'sex', width: 80, title: '性别'},\r\n");
      out.write("                {field: 'tel', width: 380, title: '电话'},\r\n");
      out.write("                {field: 'number', width: 80, title: '可借数量'},\r\n");
      out.write("                {templet:\"<div>{{layui.util.toDateString(d.creatDate,'yyyy-MM-dd HH:mm:ss')}}</div>\", width: 180, title: '办卡时间'},\r\n");
      out.write("                {title: '操作', minWidth: 150, toolbar: '#currentTableBar', align: \"center\"}\r\n");
      out.write("            ]],\r\n");
      out.write("            limits: [10, 15, 20, 25, 50, 100],\r\n");
      out.write("            limit: 15,\r\n");
      out.write("            page: true,\r\n");
      out.write("            skin: 'line',\r\n");
      out.write("            id:'testReload'\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var $ = layui.$, active = {\r\n");
      out.write("            reload: function(){\r\n");
      out.write("                var cardNumber = $('#cardNumber').val();\r\n");
      out.write("                var username = $('#username').val();\r\n");
      out.write("                var tel = $('#tel').val();\r\n");
      out.write("                //执行重载\r\n");
      out.write("                table.reload('testReload', {\r\n");
      out.write("                    page: {\r\n");
      out.write("                        curr: 1 //重新从第 1 页开始\r\n");
      out.write("                    }\r\n");
      out.write("                    ,where: {\r\n");
      out.write("                        cardnumber: cardNumber,\r\n");
      out.write("                        username:username,\r\n");
      out.write("                        tel:tel\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                }, 'data');\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        $('.demoTable .layui-btn').on('click', function(){\r\n");
      out.write("            var type = $(this).data('type');\r\n");
      out.write("            active[type] ? active[type].call(this) : '';\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        /**\r\n");
      out.write("         * tool操作栏监听事件\r\n");
      out.write("         */\r\n");
      out.write("        table.on('tool(currentTableFilter)', function (obj) {\r\n");
      out.write("            var data=obj.data;\r\n");
      out.write("            if (obj.event === 'edit') {  // 监听添加操作\r\n");
      out.write("                var index = layer.open({\r\n");
      out.write("                    title: '修改信息',\r\n");
      out.write("                    type: 2,\r\n");
      out.write("                    shade: 0.2,\r\n");
      out.write("                    maxmin:true,\r\n");
      out.write("                    shadeClose: true,\r\n");
      out.write("                    area: ['60%', '60%'],\r\n");
      out.write("                    content: '");
      out.print(basePath);
      out.write("queryReaderInfoById?id='+data.id,\r\n");
      out.write("                });\r\n");
      out.write("                $(window).on(\"resize\", function () {\r\n");
      out.write("                    layer.full(index);\r\n");
      out.write("                });\r\n");
      out.write("            } else if (obj.event === 'delete') {  // 监听删除操作\r\n");
      out.write("                layer.confirm('确认删除吗', function (index) {\r\n");
      out.write("                    //调用删除功能\r\n");
      out.write("                    deleteInfoByIds(data.id,index);\r\n");
      out.write("                    layer.close(index);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //监听表格复选框选择\r\n");
      out.write("        table.on('checkbox(currentTableFilter)', function (obj) {\r\n");
      out.write("            console.log(obj)\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        /**\r\n");
      out.write("         * 获取选中记录的id信息\r\n");
      out.write("         */\r\n");
      out.write("        function getCheackId(data){\r\n");
      out.write("            var arr=new Array();\r\n");
      out.write("            for(var i=0;i<data.length;i++){\r\n");
      out.write("                arr.push(data[i].id);\r\n");
      out.write("            }\r\n");
      out.write("            //拼接id\r\n");
      out.write("            return arr.join(\",\");\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        /**\r\n");
      out.write("         * 提交删除功能\r\n");
      out.write("         */\r\n");
      out.write("        function deleteInfoByIds(ids ,index){\r\n");
      out.write("            //向后台发送请求\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"deleteReader\",\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                data: {ids: ids},\r\n");
      out.write("                success: function (result) {\r\n");
      out.write("                    if (result.code == 0) {//如果成功\r\n");
      out.write("                        layer.msg('删除成功', {\r\n");
      out.write("                            icon: 6,\r\n");
      out.write("                            time: 500\r\n");
      out.write("                        }, function () {\r\n");
      out.write("                            parent.window.location.reload();\r\n");
      out.write("                            var iframeIndex = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                            parent.layer.close(iframeIndex);\r\n");
      out.write("                        });\r\n");
      out.write("                    } else {\r\n");
      out.write("                        layer.msg(\"删除失败\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        /**\r\n");
      out.write("         * toolbar监听事件\r\n");
      out.write("         */\r\n");
      out.write("        table.on('toolbar(currentTableFilter)', function (obj) {\r\n");
      out.write("            if (obj.event === 'add') {  // 监听添加操作\r\n");
      out.write("                var index = layer.open({\r\n");
      out.write("                    title: '添加读者',\r\n");
      out.write("                    type: 2,\r\n");
      out.write("                    shade: 0.2,\r\n");
      out.write("                    maxmin:true,\r\n");
      out.write("                    shadeClose: true,\r\n");
      out.write("                    area: ['60%', '60%'],\r\n");
      out.write("                    content: '");
      out.print(basePath);
      out.write("addReader',\r\n");
      out.write("                });\r\n");
      out.write("                $(window).on(\"resize\", function () {\r\n");
      out.write("                    layer.full(index);\r\n");
      out.write("                });\r\n");
      out.write("            } else if (obj.event === 'delete') {\r\n");
      out.write("                /*\r\n");
      out.write("                  1、提示内容，必须删除大于0条\r\n");
      out.write("                  2、获取要删除记录的id信息\r\n");
      out.write("                  3、提交删除功能 ajax\r\n");
      out.write("                */\r\n");
      out.write("                //获取选中的记录信息\r\n");
      out.write("                var checkStatus=table.checkStatus(obj.config.id);\r\n");
      out.write("                var data=checkStatus.data;\r\n");
      out.write("                if(data.length==0){//如果没有选中信息\r\n");
      out.write("                    layer.msg(\"请选择要删除的记录信息\");\r\n");
      out.write("                }else{\r\n");
      out.write("                    //获取记录信息的id集合\r\n");
      out.write("                    var ids=getCheackId(data);\r\n");
      out.write("                    layer.confirm('确认删除吗', function (index) {\r\n");
      out.write("                        //调用删除功能\r\n");
      out.write("                        deleteInfoByIds(ids,index);\r\n");
      out.write("                        layer.close(index);\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
