/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-03-19 01:27:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>修改密码</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("lib/layui-v2.5.5/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(basePath);
      out.write("css/public.css\" media=\"all\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-form layuimini-form\">\r\n");
      out.write("    <input type=\"hidden\" name=\"id\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <label class=\"layui-form-label required\">原密码</label>\r\n");
      out.write("        <div class=\"layui-input-block\">\r\n");
      out.write("            <input type=\"password\" name=\"oldPwd\" lay-verify=\"required\" placeholder=\"请输入原密码\" class=\"layui-input\">\r\n");
      out.write("            <tip>请输入原密码。</tip>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <label class=\"layui-form-label required\">请输入新密码</label>\r\n");
      out.write("        <div class=\"layui-input-block\">\r\n");
      out.write("            <input type=\"password\" name=\"newPwd\" lay-verify=\"required\" placeholder=\"请输入新密码\" class=\"layui-input\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <label class=\"layui-form-label required\">请再次输入新密码</label>\r\n");
      out.write("        <div class=\"layui-input-block\">\r\n");
      out.write("            <input type=\"password\" name=\"newPwd2\" lay-verify=\"required\" placeholder=\"请再次输入新密码\" class=\"layui-input\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("        <div class=\"layui-input-block\">\r\n");
      out.write("            <button class=\"layui-btn layui-btn-normal\" lay-submit lay-filter=\"saveBtn\">修改密码</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.print(basePath);
      out.write("lib/layui-v2.5.5/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form'], function () {\r\n");
      out.write("        var form = layui.form,\r\n");
      out.write("            layer = layui.layer,\r\n");
      out.write("            $ = layui.$;\r\n");
      out.write("\r\n");
      out.write("        //监听提交\r\n");
      out.write("        form.on('submit(saveBtn)', function (data) {\r\n");
      out.write("            var datas=data.field;//form单中的数据信息\r\n");
      out.write("            if(datas.newPwd!=datas.newPwd2){\r\n");
      out.write("                layer.msg(\"两次输入的新密码不一样...请重新输入\")\r\n");
      out.write("            }else{\r\n");
      out.write("                //向后台发送数据提交添加\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url:\"updatePwdSubmit\",\r\n");
      out.write("                    type:\"POST\",\r\n");
      out.write("                    data: {\r\n");
      out.write("                        id:datas.id,\r\n");
      out.write("                        oldPwd:datas.oldPwd,\r\n");
      out.write("                        newPwd:datas.newPwd\r\n");
      out.write("                    },\r\n");
      out.write("                    success:function(result){\r\n");
      out.write("                        if(result.code==0){//如果成功\r\n");
      out.write("                            layer.msg(result.msg,{\r\n");
      out.write("                                icon:6,\r\n");
      out.write("                                time:500\r\n");
      out.write("                            },function(){\r\n");
      out.write("                                parent.window.location.reload();\r\n");
      out.write("                                var iframeIndex = parent.layer.getFrameIndex(window.name);\r\n");
      out.write("                                parent.layer.close(iframeIndex);\r\n");
      out.write("                            })\r\n");
      out.write("                        }else{\r\n");
      out.write("                            layer.msg(result.msg);\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("            return false;\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
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
