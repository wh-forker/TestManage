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
		String[] f={"��δ����","��ʦ�����","ͨ�����,�����ɹ�"};  //0Ϊδ������1Ϊ����У�2Ϊ���ͨ����
		TestRejDao dao=new TestRejDao();
		TestRej tr=dao.getTestRej(account);
		int state=tr.getState();
		
	if(state==0){ 
		try{
			dao.addTestRej(account,name,professional,course,term,workname,composer,type,1);	
			request.setAttribute("list",tr);
			request.setAttribute("sstate","��ʦ����У�");
			request.setAttribute("message","�����ظ�������");
			
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("sstate","δ������");
		}finally{
			request.getRequestDispatcher("stuTest.jsp").forward(request, response);	
		}
	}else if(state==1){
		request.setAttribute("sstate","��ʦ����У�");
		request.setAttribute("message","�����ظ�������");
		request.getRequestDispatcher("stuTest.jsp").forward(request, response);
	}
	else{
		request.setAttribute("sstate","���ͨ��,�����ɹ���");
		request.setAttribute("message","�����ظ�������");
		request.getRequestDispatcher("stuTest.jsp").forward(request, response);
	}
	}
}




