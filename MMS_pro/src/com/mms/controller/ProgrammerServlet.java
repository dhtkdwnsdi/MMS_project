package com.mms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;

/**
 * 
 * @author LEE HAN
 * 
 */

/**
 * Servlet implementation class ProgrammerServlet
 */
@WebServlet("/prog")
public class ProgrammerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProgrammerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		
		String command = request.getParameter("command");
		System.out.println("ProgrammerServlet에서 요청 받음을 확인: " + command);
		
		if(command == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
		} else if(command.equals("loginForm")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} else {
			ProgrammerActionFactory af = ProgrammerActionFactory.getInstance();
			Action action = af.getAction(command);
			
			if(action != null) {
				action.execute(request, response);
			}
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
