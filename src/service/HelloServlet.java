package service;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Announcement;
import dao.AdminDao;
 

public class HelloServlet extends HttpServlet {
	
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
 
			 AdminDao dao=new AdminDao();
			 Announcement a=dao.getAnnouncement();				 
			 request.setAttribute("Announcement",a);
			 request.getRequestDispatcher("index.jsp").forward(request, response);
			 
	}
}
