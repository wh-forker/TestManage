package service;


 
import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TestRej;

import dao.TestRejDao;

public class TeachInfoServlet extends HttpServlet {
	
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
	   TestRejDao dao =new TestRejDao();
	   List<TestRej> tr= dao.getAllTestRej();
	   request.setAttribute("list",tr);
	   request.getRequestDispatcher("teachInfo.jsp").forward(request, response);

	}
}


