package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuScore;

import dao.StuScoreDao;

public class UpdateStuScoreServlet extends HttpServlet {

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
		int term=Integer.valueOf(request.getParameter("term"));
		String maincourse=request.getParameter("maincourse");
		String type1=request.getParameter("type1");
		Double usualperformance=Double.valueOf(request.getParameter("usualperformance"));
		String midwork=request.getParameter("midwork");
		Double quiz=Double.valueOf(request.getParameter("quiz"));
		String finalwork=request.getParameter("finalwork");
		Double finalgrade=Double.valueOf(request.getParameter("finalgrade"));
		Double grade=Double.valueOf(request.getParameter("grade"));
		
		String secondcourse=request.getParameter("secondcourse");
		String type2=request.getParameter("type2");
		Double usualperformance2=Double.valueOf(request.getParameter("usualperformance2"));
		String midwork2=request.getParameter("midwork2");
		Double quiz2=Double.valueOf(request.getParameter("quiz2"));
		String finalwork2=request.getParameter("finalwork2");
		Double finalgrade2=Double.valueOf(request.getParameter("finalgrade2"));
		Double grade2=Double.valueOf(request.getParameter("grade2"));
		
		String secondcourse3=request.getParameter("secondcourse3");
		String type3=request.getParameter("type3");
		Double usualperformance3=Double.valueOf(request.getParameter("usualperformance3"));
		String midwork3=request.getParameter("midwork3");
		Double quiz3=Double.valueOf(request.getParameter("quiz3"));
		String finalwork3=request.getParameter("finalwork3");
		Double finalgrade3=Double.valueOf(request.getParameter("finalgrade3"));
		Double grade3=Double.valueOf(request.getParameter("grade3"));
		
		StuScoreDao dao = new StuScoreDao();
		dao.updateStuScore(account,term,maincourse,type1,usualperformance,midwork,quiz,finalwork,finalgrade,grade,secondcourse,type2,usualperformance2,midwork2,quiz2,finalwork2,finalgrade2,grade2,secondcourse3,type3,usualperformance3,midwork3,quiz3,finalwork3,finalgrade,grade3);
		
		StuScore ss=dao.getStuScore(account,term);
		
		request.setAttribute("message","修改成功！");
		request.setAttribute("stuScore",ss);
		request.setAttribute("message","修改成功，返回查看！");
		request.getRequestDispatcher("modifyStuScore.jsp").forward(request, response);
		
	}
}
