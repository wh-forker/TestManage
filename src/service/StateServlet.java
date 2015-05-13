package service;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TestRej;

import dao.TestRejDao;

public class StateServlet extends HttpServlet {
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
 
	//String[] f={"尚未报名","老师审核中","通过审核,报名成功"};  //0为未报名，1为审核中，2为审核通过。
	
	TestRejDao dao=new TestRejDao();
	TestRej tr=dao.getTestRej(account);
	int state=tr.getState();
	
if(state==0){ 
	try{
		request.setAttribute("sstate","未报名！");
	}catch(Exception e){
		e.printStackTrace();
		request.setAttribute("sstate","未报名！");
	}finally{
		request.getRequestDispatcher("stuTest.jsp").forward(request, response);	
	}
}else if(state==1){
	request.setAttribute("sstate","老师审核中,请勿重复报名！");
	request.getRequestDispatcher("stuTest.jsp").forward(request, response);
}
else{
	request.setAttribute("sstate","审核通过,报名成功！");
	request.getRequestDispatcher("stuTest.jsp").forward(request, response);
}

}
}
