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

public class TQueryServlet extends HttpServlet {
	
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
		StuInfo si = dao.getStuInfo(account);
		StuScoreDao sdao=new StuScoreDao();
		StuScore[] ss= sdao.getStuAllScore(account);
		request.setAttribute("stuInfo",si);
		request.setAttribute("term1",ss[0]);
		request.setAttribute("term2",ss[1]);
		request.setAttribute("term3",ss[2]);
		request.setAttribute("term4",ss[3]);
		request.setAttribute("term5",ss[4]);
		request.setAttribute("term6",ss[5]);
		request.setAttribute("term7",ss[6]);
		request.setAttribute("term8",ss[7]);
		
		request.getRequestDispatcher("tQuery.jsp").forward(request, response);
	}
}



