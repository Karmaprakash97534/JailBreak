package com.java.jailbreak;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CriminalRegisterServlet")
public class CriminalRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CriminalRegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String fullname = request.getParameter("fullname");
		
		
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String education = request.getParameter("education");
		String[] address = request.getParameterValues("address");
		
		
		String noofcase = request.getParameter("noofcase");
		String ipcsection = request.getParameter("ipcsection");
	    String crimeinfo = request.getParameter("crimeinfo");
		String activecase = request.getParameter("activecase");
		String  pendingcase =request.getParameter("pendingcase");
		
		
		String jailname = request.getParameter("jailname");
		String entrydate = request.getParameter("entrydate");
		String exitdate = request.getParameter("exitdate");
		String mettingdate = request.getParameter("mettingdate");
		
		//Setting final address in one column
		
		String fulladdress = String.join(",","address");
		UserData user = new UserData(username,fullname,age,gender,education,fulladdress,noofcase,ipcsection,crimeinfo,activecase,pendingcase,jailname,entrydate,exitdate,mettingdate);             
		 int res = CriminalDao.saveData(user);
		if(res==1)
		{	RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterSuccess.jsp");
			dispatcher.forward(request, response);
		}
		else
		{	RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterFail.jsp");
			dispatcher.forward(request, response);
		}	
		
		// TODO Auto-generated method stub
	}

}
