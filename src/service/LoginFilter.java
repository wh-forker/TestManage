package service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{
	//FilterConfig可用于访问Filter的配置信息
	private FilterConfig config;
	//实现初始化方法
	@Override
	public void init(FilterConfig config)
	{
		this.config = config; 
	}
	//实现销毁方法1
	@Override
	public void destroy()
	{
		this.config = null; 
	}
	@Override
	public void doFilter(ServletRequest request,
			ServletResponse response, FilterChain chain)
			throws IOException,ServletException	{
	 
			String loginPage = config.getInitParameter("loginPage");
			String LoginServlet = config.getInitParameter("LoginServlet");
			HttpServletRequest requ = (HttpServletRequest)request;
			HttpSession session = requ.getSession(true);
			String requestPath = requ.getServletPath();
			if( session.getAttribute("teacher")== null && session.getAttribute("admin")== null && session.getAttribute("student")== null
				&& !requestPath.endsWith(loginPage) && !requestPath.endsWith(LoginServlet) &&  !requestPath.endsWith(".css")&&!requestPath.endsWith(".js")&&!requestPath.endsWith(".jpg") ){
				request.setAttribute("loginError" , "您还没有登录呢");
				request.getRequestDispatcher(loginPage).forward(request, response);
			}
			else{
				chain.doFilter(request, response);
			}
		} 
}
