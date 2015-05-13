package service;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AdminTest;
import dao.AdminTestDao;
 
public class teachClassServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminTestDao dao = new AdminTestDao();
		List<AdminTest> list = dao.getAllTestInfo();
		request.setAttribute("list",list);
		request.getRequestDispatcher("teachClass.jsp").forward(request, response);
		
	}
}
