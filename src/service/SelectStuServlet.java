package service;

import java.util.List;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuInfo;

import dao.StuInfoDao;

public class SelectStuServlet extends HttpServlet {
 
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String account=request.getParameter("account");
		
		StuInfoDao dao=new StuInfoDao();
		
		List<StuInfo> si=dao.getStuInformation(account);		
		
		request.setAttribute("list",si);
		request.getRequestDispatcher("adminInfo.jsp").forward(request, response);
		
	
	}
}
