package service;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;

import dao.AdminDao;

public class UpdateAdmPwdServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request,response);	 
	}
 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String newPwd =request.getParameter("pwd");
		
		HttpSession adm=request.getSession(); 
	    Admin a=(Admin) adm.getAttribute("admin");
	 	String account=a.getAccount();
		
		AdminDao dao=new AdminDao();
				
		dao.updatePWD(account,newPwd);
		
		 request.setAttribute("message","密码修改成功,请退出,使用新密码重新登录！" );
		 request.getRequestDispatcher("modifyAdminPw.jsp").forward(request, response);
		 
	}
}
