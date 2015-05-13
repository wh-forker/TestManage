package service;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuInfo;
import model.StuScore;
import dao.StuInfoDao;
import dao.StuScoreDao;

public class teacherServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	}
 
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String account=request.getParameter("account");
		int term=Integer.valueOf(request.getParameter("term"));
		StuInfoDao dao = new StuInfoDao();
		StuInfo si = dao.getStuInfo(account);
		
		StuScoreDao sdao=new StuScoreDao();
		StuScore ss= sdao.getStuScore(account,term);
		
		request.setAttribute("stuInfo",si);
		request.setAttribute("stuScore",ss);
		request.getRequestDispatcher("teachClass.jsp").forward(request, response);
	}
		

}
