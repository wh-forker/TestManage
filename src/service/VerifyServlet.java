package service;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;

import dao.TestRejDao;

public class VerifyServlet extends HttpServlet {

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
		
		int state =Integer.valueOf(request.getParameter("state"));
		String account=request.getParameter("account");
	 		
	    TestRejDao dao=new TestRejDao();
				
		dao.updateState(account,state);
		//dao.delTestRej(account);
		
		request.setAttribute("message","操作成功,待审核列表已更新！" );
		
		request.getRequestDispatcher("GetTestRejServlet").forward(request, response);
		 
	}

	
	
}
