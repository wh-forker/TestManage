package service;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Admin;
import model.Student;
import model.Teacher;

import dao.AdminDao;
import dao.StudentDao;
import dao.TeacherDao;

public class LoginServlet extends HttpServlet {
	
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
		
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		String id=request.getParameter("identity");
	 if(id.equals("1")){
			 StudentDao dao=new StudentDao();
			 Student ad=dao.getStudent(account);
					if(ad.getAccount()==null || !ad.getPassword().equals(password)){
					request.setAttribute("loginError","’À∫≈ªÚ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î!");
					request.getRequestDispatcher("index.jsp").forward(request, response);
					}else{		 
						request.getSession().setAttribute("student",ad);
						request.getRequestDispatcher("student.jsp").forward(request, response);
					}
		}
	else if(id.equals("0")){	
	    AdminDao dao=new AdminDao();
		Admin ad=dao.getAdmin(account);
			if(ad.getAccount()==null || !ad.getPassword().equals(password)){
			request.setAttribute("loginError","’À∫≈ªÚ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			}else{		 
				request.getSession().setAttribute("admin",ad);
				request.getRequestDispatcher("admin.jsp").forward(request, response);
			}
		}	
	else{
			 TeacherDao dao=new TeacherDao();
			 Teacher ad=dao.getTeacher(account);
					if(ad.getAccount()==null || !ad.getPassword().equals(password)){
					request.setAttribute("loginError","’À∫≈ªÚ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î!");
					request.getRequestDispatcher("index.jsp").forward(request, response);
					}else{		 
						request.getSession().setAttribute("teacher",ad);
						request.getRequestDispatcher("teacher.jsp").forward(request, response);
					}
		}
	
	}
 

}
