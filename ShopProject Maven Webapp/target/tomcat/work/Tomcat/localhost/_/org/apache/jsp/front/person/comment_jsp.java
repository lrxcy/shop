/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2018-07-10 07:54:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.front.person;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.legendary.entity.CommentHelper;
import java.util.*;

public final class comment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("\t<title>发表评论</title>\r\n");
      out.write("\t<link href=\"/front/AmazeUI-2.4.2/assets/css/admin.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"/front/AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"/front/css/personal.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"/front/css/appstyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/front/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<article>\r\n");
      out.write("\t\t\t\t<div class=\"mt-logo\">\r\n");
      out.write("\t\t\t\t\t<!--顶部导航条 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"am-container header\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"message-l\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topMessage\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"menu-hd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"message-r\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topMessage home\"><div class=\"menu-hd\"><a href=\"/front/home/home.jsp\" target=\"_top\" class=\"h\">商城首页</a></div></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topMessage my-shangcheng\"><div class=\"menu-hd MyShangcheng\"><a href=\"/front/user/index.jsp\" target=\"_top\"><i class=\"am-icon-user am-icon-fw\"></i>个人中心</a></div></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topMessage mini-cart\"><div class=\"menu-hd\"><a id=\"mc-menu-hd\" href=\"/GoodsCartServlet?method=query&meid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.meid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" target=\"_top\"><i class=\"am-icon-shopping-cart  am-icon-fw\"></i><span>购物车</span></a></div></div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--悬浮搜索框-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"nav white\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"logoBig\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><img src=\"/front/images/logobig.png\" /></li>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-bar pr\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a name=\"index_none_header_sysc\" href=\"#\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"/FrontGoodsServlet\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"method\" value=\"query\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"searchInput\" name=\"keyword\" type=\"text\" placeholder=\"搜索\" autocomplete=\"off\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"ai-topsearch\" class=\"submit am-btn\"  value=\"搜索\" index=\"1\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("            <div class=\"nav-table\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"long-title\"><span class=\"all-goods\">全部分类</span></div>\r\n");
      out.write("\t\t\t\t\t   <div class=\"nav-cont\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"index\"><a href=\"#\">首页</a></li>\r\n");
      out.write("                                <li class=\"qc\"><a href=\"#\">闪购</a></li>\r\n");
      out.write("                                <li class=\"qc\"><a href=\"#\">限时抢</a></li>\r\n");
      out.write("                                <li class=\"qc\"><a href=\"#\">团购</a></li>\r\n");
      out.write("                                <li class=\"qc last\"><a href=\"#\">大包装</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t    <div class=\"nav-extra\">\r\n");
      out.write("\t\t\t\t\t\t    \t<i class=\"am-icon-user-secret am-icon-md nav-user\"></i><b></b>我的福利\r\n");
      out.write("\t\t\t\t\t\t    \t<i class=\"am-icon-angle-right\" style=\"padding-left: 10px;\"></i>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<b class=\"line\"></b>\r\n");
      out.write("\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t<div class=\"col-main\">\r\n");
      out.write("\t\t\t\t<div class=\"main-wrap\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"user-comment\">\r\n");
      out.write("\t\t\t\t\t\t<!--标题 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-cf am-padding\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-fl am-cf\"><strong class=\"am-text-danger am-text-lg\">发表评论</strong> / <small>Make&nbsp;Comments</small></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<hr/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"comment-main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<form action=\"/CommentServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"method\" value=\"add\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"oid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"meid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.meid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"size\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comments.size() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-btn am-btn-danger\">发表评论</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\t\t$(\".comment-list .item-opinion li\").click(function() {\t\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).prevAll().children('i').removeClass(\"active\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).nextAll().children('i').removeClass(\"active\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).children('i').addClass(\"active\");\r\n");
      out.write("\t\t\t\t\t\t\t\tvar t = $(this).children('i').attr(\"select\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).parent().find(\".op\").val(t)\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$(\".info-btn\").click(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"form\").submit();\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t     \t})\r\n");
      out.write("\t\t\t\t\t</script>\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<aside class=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\">个人中心</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">个人资料</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/MemberServlet?method=preEdit&meid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.meid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >个人信息</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/AddressServlet?method=query&meid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.meid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">收货地址</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"person\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">我的交易</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/FrontOrderServlet?method=query&meid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.meid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">订单管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/FrontOrderServlet?method=returnQuery&meid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.meid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">退款售后</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</aside>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /front/person/comment.jsp(28,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb == null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"/front/user/login.jsp\" target=\"_top\" class=\"h\">亲，请登录</a> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"/front/user/login.jsp\" target=\"_top\">免费注册</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /front/person/comment.jsp(32,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb != null }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" target=\"_top\" class=\"h\">欢迎您:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_memb.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /front/person/comment.jsp(100,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/front/person/comment.jsp(100,6) '${comments }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${comments }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /front/person/comment.jsp(100,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /front/person/comment.jsp(100,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"comment-list\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"item-pic\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"J_MakePoint\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.picinfo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"itempic\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"item-title\">\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"item-name\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"item-basic-info\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.gname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"item-info\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"info-little\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.specdetail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"item-price\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t价格：<strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.sellPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("元</strong>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"item-comment\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<textarea name=\"content");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" placeholder=\"请写下对宝贝的感受吧，对他人帮助很大哦！\"></textarea>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"item-opinion\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"op1 active\" select=\"1\"></i>好评</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"op2\" select=\"2\"></i>中评</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<li><i class=\"op3\" select=\"3\"></i>差评</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input class=\"op\" type=\"hidden\" name=\"op");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" value=\"1\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"gid");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.gid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}