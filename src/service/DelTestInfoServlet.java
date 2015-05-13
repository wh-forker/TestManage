package service;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminTestDao;
import dao.StuInfoDao;

public class DelTestInfoServlet extends HttpServlet {
	
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
		
		String place=request.getParameter("place");
		AdminTestDao dao = new AdminTestDao();
		dao.delTestInfo(place);
 
		request.setAttribute("dmessage","É¾³ý³É¹¦£¡");
		request.getRequestDispatcher("AdminTestServlet").forward(request, response);

	}
}
