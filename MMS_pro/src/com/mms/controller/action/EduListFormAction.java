package com.mms.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;


public class EduListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "profile/eduListForm.jsp";
		
		EduDAO eduDao = EduDAO.getInstance();
		
		  
	      String progNum = request.getParameter("progNum");
	      /*
	       * String LoginUser = (String)request.getSession().getAttribute("LoginUser");
	       */
	      System.out.println("progNum : " + progNum);
	      
	      List<EduVO> eduList = eduDao.selectEdu(progNum);
	      
	      request.setAttribute("eduList", eduList);
	      
	      System.out.println(eduList);
	      
	      
	      RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	      dispatcher.forward(request, response);
	   }

	}