package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuInfo;

import dao.StuInfoDao;
 

public class AdminInfoServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}


	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	 
		StuInfoDao dao = new StuInfoDao();
		List<StuInfo> list = dao.getAllStuInfo();
		request.setAttribute("list",list);
		request.getRequestDispatcher("adminInfo.jsp").forward(request, response);
		
	}

}
