package service;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.AdminDao;

public class UpdateAnnouncementServlet extends HttpServlet {

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
		
		String text =request.getParameter("text");
		
		AdminDao dao=new AdminDao();
				
		dao.updateAnnouncement(text);
		
		 request.setAttribute("message","通知修改成功,请退出，返回首页查看！" );
		 request.getRequestDispatcher("announcement.jsp").forward(request, response);
		 
	}

}
