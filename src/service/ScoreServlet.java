package service;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuScore;

import dao.StuScoreDao;

public class ScoreServlet extends HttpServlet {
	
	
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
		StuScoreDao dao = new StuScoreDao();
		StuScore ss = dao.getStuScore(account,term);
		
		request.setAttribute("stuScore",ss);
		request.getRequestDispatcher("Score.jsp").forward(request, response);
	}


}
