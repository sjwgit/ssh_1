/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M17
 * Generated at: 2017-10-17 11:05:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.15.3.jar", Long.valueOf(1507773654905L));
    _jspx_dependants.put("jar:file:/E:/Users/sjw/sshcases/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ssh_1/WEB-INF/lib/struts2-core-2.3.15.3.jar!/META-INF/struts-tags.tld", Long.valueOf(1381842372000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fdebug_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fdebug_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fdebug_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");

   String path = request.getContextPath();

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/logReg.css\"/>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"js/RegLog.js\"></script> \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("     function login(event){\r\n");
      out.write("    \t event.preventDefault();\r\n");
      out.write("    \t var username =$(\"#username\").val();\r\n");
      out.write("    \t var pw =$(\"#pw\").val();\r\n");
      out.write("    \t\r\n");
      out.write("    \t  if(username ==\"\" || pw ==\"\"){\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t  document.getElementById(\"div1\").innerHTML=\"用户名或密码不正确\";\r\n");
      out.write("    \t\t  \r\n");
      out.write("    \t  }\r\n");
      out.write("    \t \r\n");
      out.write("     }\r\n");
      out.write("      function register(event) {\r\n");
      out.write("    \t  event.preventDefault();\r\n");
      out.write("    \t  window.location.href=\"./register.jsp\"\r\n");
      out.write("\t} \r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("<body style=\"background-image: url('imgs/login.jpg'); width:100%;height:100%;\">\r\n");
      out.write("        <center>\r\n");
      out.write("          ");
      if (_jspx_meth_s_005fdebug_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </center>\r\n");
      out.write("       \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fdebug_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:debug
    org.apache.struts2.views.jsp.ui.DebugTag _jspx_th_s_005fdebug_005f0 = (org.apache.struts2.views.jsp.ui.DebugTag) _005fjspx_005ftagPool_005fs_005fdebug_005fnobody.get(org.apache.struts2.views.jsp.ui.DebugTag.class);
    boolean _jspx_th_s_005fdebug_005f0_reused = false;
    try {
      _jspx_th_s_005fdebug_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fdebug_005f0.setParent(null);
      int _jspx_eval_s_005fdebug_005f0 = _jspx_th_s_005fdebug_005f0.doStartTag();
      if (_jspx_th_s_005fdebug_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fdebug_005fnobody.reuse(_jspx_th_s_005fdebug_005f0);
      _jspx_th_s_005fdebug_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fdebug_005f0_reused) {
        _jspx_th_s_005fdebug_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fdebug_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fid_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    boolean _jspx_th_s_005fform_005f0_reused = false;
    try {
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /index.jsp(40,8) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("form-find.action");
      // /index.jsp(40,8) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setMethod("post");
      // /index.jsp(40,8) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setValidate("true");
      // /index.jsp(40,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setId("form-position");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fform_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("           <div id=\"div1\"></div>\r\n");
          out.write("          ");
          if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("           \r\n");
          out.write("          ");
          if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          ");
          if (_jspx_meth_s_005fsubmit_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("            \r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
      _jspx_th_s_005fform_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fform_005f0_reused) {
        _jspx_th_s_005fform_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fform_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f0_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /index.jsp(42,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setName("username");
      // /index.jsp(42,10) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setLabel("用户名");
      // /index.jsp(42,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f0.setId("username");
      // /index.jsp(42,10) null
      _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "style", "width:300px;");
      int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
      if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      _jspx_th_s_005ftextfield_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005ftextfield_005f0_reused) {
        _jspx_th_s_005ftextfield_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005ftextfield_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    boolean _jspx_th_s_005ftextfield_005f1_reused = false;
    try {
      _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /index.jsp(44,10) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f1.setName("pw");
      // /index.jsp(44,10) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f1.setLabel("密码");
      // /index.jsp(44,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005ftextfield_005f1.setId("pw");
      // /index.jsp(44,10) null
      _jspx_th_s_005ftextfield_005f1.setDynamicAttribute(null, "style", "width:300px;");
      int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
      if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fname_005flabel_005fid_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      _jspx_th_s_005ftextfield_005f1_reused = true;
    } finally {
      if (!_jspx_th_s_005ftextfield_005f1_reused) {
        _jspx_th_s_005ftextfield_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005ftextfield_005f1);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    boolean _jspx_th_s_005fsubmit_005f0_reused = false;
    try {
      _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /index.jsp(45,10) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setType("image");
      // /index.jsp(45,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setValue("登陆");
      // /index.jsp(45,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setId("login");
      // /index.jsp(45,10) name = src type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setSrc("imgs/submit.png");
      // /index.jsp(45,10) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setOnclick("login(event)");
      int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
      if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      _jspx_th_s_005fsubmit_005f0_reused = true;
    } finally {
      if (!_jspx_th_s_005fsubmit_005f0_reused) {
        _jspx_th_s_005fsubmit_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fsubmit_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    boolean _jspx_th_s_005fsubmit_005f1_reused = false;
    try {
      _jspx_th_s_005fsubmit_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /index.jsp(46,10) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f1.setType("image");
      // /index.jsp(46,10) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f1.setValue("注册");
      // /index.jsp(46,10) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f1.setId("register");
      // /index.jsp(46,10) name = src type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f1.setSrc("imgs/reg_logo.png");
      // /index.jsp(46,10) name = onclick type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f1.setOnclick("register(event)");
      int _jspx_eval_s_005fsubmit_005f1 = _jspx_th_s_005fsubmit_005f1.doStartTag();
      if (_jspx_th_s_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005ftype_005fsrc_005fonclick_005fid_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
      _jspx_th_s_005fsubmit_005f1_reused = true;
    } finally {
      if (!_jspx_th_s_005fsubmit_005f1_reused) {
        _jspx_th_s_005fsubmit_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_s_005fsubmit_005f1);
      }
    }
    return false;
  }
}
