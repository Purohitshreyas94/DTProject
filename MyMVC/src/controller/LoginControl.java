package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dao.LoginDb;
import model.*;
import dao.*;

@WebServlet("/LoginControl")

public class LoginControl extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username= request.getParameter("uname");
		String password= request.getParameter("passwd");
		
		Login loginobj=new Login();
		loginobj.setLogin(username);
		loginobj.setPassword(password);
		
		try
		{
		
		LoginDb loginDAO=new LoginDb();
		
			
		if(loginDAO.isValid(loginobj))
		{
			
			RequestDispatcher dispatch = request.getRequestDispatcher("success.jsp");
            dispatch.forward(request, response);
		}
		
		else
		{
			
			RequestDispatcher dispatch = request.getRequestDispatcher("failure.jsp");

			dispatch.forward(request,response);
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
	
