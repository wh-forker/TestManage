package service;


import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuScore;
import model.TestRej;

import dao.StuScoreDao;
import dao.TestRejDao;

public class GetTestRejServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		TestRejDao dao = new TestRejDao();
		List<TestRej> list = dao.getAllTestRej();
 
		request.setAttribute("list",list);
		
		request.getRequestDispatcher("rejVerify.jsp").forward(request, response);
	}
}
