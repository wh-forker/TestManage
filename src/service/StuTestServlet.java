package service;


import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StuInfo;
import model.StuScore;
import model.TestRej;

import dao.StuInfoDao;
import dao.TestRejDao;

public class StuTestServlet extends HttpServlet {
	
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
		String professional=request.getParameter("professional");
		String course=request.getParameter("course");
		String term=request.getParameter("term");
		String workname=request.getParameter("workname");
		String composer=request.getParameter("composer");
		String type=request.getParameter("type");
		String[] f={"尚未报名","老师审核中","通过审核,报名成功"};  //0为未报名，1为审核中，2为审核通过。
		TestRejDao dao=new TestRejDao();
		TestRej tr=dao.getTestRej(account);
		int state=tr.getState();
		
	if(state==0){ 
		try{
			dao.addTestRej(account,name,professional,course,term,workname,composer,type,1);	
			request.setAttribute("list",tr);
			request.setAttribute("sstate","老师审核中！");
			request.setAttribute("message","请勿重复报名！");
			
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("sstate","未报名！");
		}finally{
			request.getRequestDispatcher("stuTest.jsp").forward(request, response);	
		}
	}else if(state==1){
		request.setAttribute("sstate","老师审核中！");
		request.setAttribute("message","请勿重复报名！");
		request.getRequestDispatcher("stuTest.jsp").forward(request, response);
	}
	else{
		request.setAttribute("sstate","审核通过,报名成功！");
		request.setAttribute("message","请勿重复报名！");
		request.getRequestDispatcher("stuTest.jsp").forward(request, response);
	}
	}
}




