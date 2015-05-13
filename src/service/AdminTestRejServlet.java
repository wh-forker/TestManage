package service;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AdminTest;
import model.TestRej;

import dao.AdminTestDao;
import dao.TestRejDao;

public class AdminTestRejServlet extends HttpServlet {
	
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
		
		String testTime=request.getParameter("testTime");
		String term=request.getParameter("term");
		String type=request.getParameter("type");
		String num=request.getParameter("num");
		String course=request.getParameter("course");
		String place=request.getParameter("place");
		String note=request.getParameter("note");
 
		AdminTestDao dao=new AdminTestDao();
	    dao.addTestDao(testTime, term,type, place, num, course, note);
		request.setAttribute("message","发布成功!");
		request.getRequestDispatcher("AdminTestServlet").forward(request, response);
	 
	}
}
