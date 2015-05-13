package service;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StuInfoDao;

public class DelStuInfoServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String account=request.getParameter("account");
		StuInfoDao dao = new StuInfoDao();
		dao.delStuInfo(account);
		request.setAttribute("message","É¾³ý³É¹¦£¡");
		request.getRequestDispatcher("AdminInfoServlet").forward(request, response);
	}
}
