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
 
	//String[] f={"��δ����","��ʦ�����","ͨ�����,�����ɹ�"};  //0Ϊδ������1Ϊ����У�2Ϊ���ͨ����
	
	TestRejDao dao=new TestRejDao();
	TestRej tr=dao.getTestRej(account);
	int state=tr.getState();
	
if(state==0){ 
	try{
		request.setAttribute("sstate","δ������");
	}catch(Exception e){
		e.printStackTrace();
		request.setAttribute("sstate","δ������");
	}finally{
		request.getRequestDispatcher("stuTest.jsp").forward(request, response);	
	}
}else if(state==1){
	request.setAttribute("sstate","��ʦ�����,�����ظ�������");
	request.getRequestDispatcher("stuTest.jsp").forward(request, response);
}
else{
	request.setAttribute("sstate","���ͨ��,�����ɹ���");
	request.getRequestDispatcher("stuTest.jsp").forward(request, response);
}

}
}
