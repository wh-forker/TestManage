package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuInfo;

import dao.StuInfoDao;

public class UpdateStuInfoServlet extends HttpServlet {

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
		
		String account=request.getParameter("account");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String maincourse=request.getParameter("maincourse");
		String mainteacher=request.getParameter("mainteacher");
		String secondcourse=request.getParameter("secondcourse");
		String secondteacher=request.getParameter("secondteacher");
		String secondcourse2=request.getParameter("secondcourse2");
		String secondteacher2=request.getParameter("secondteacher2");
		
		StuInfoDao dao = new StuInfoDao();
		dao.updateStuInfo(account,name,gender,maincourse,mainteacher,secondcourse,secondteacher,secondcourse2,secondteacher2);
		StuInfo si=dao.getStuInfo(account);
		
		request.setAttribute("message","ÐÞ¸Ä³É¹¦£¡");
		request.setAttribute("stuInfo",si);
		request.getRequestDispatcher("modifyStuInfo.jsp").forward(request, response);
		
	}
}
