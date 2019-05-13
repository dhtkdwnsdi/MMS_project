package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;

public class EduRegisterAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/prog?command=eduListForm";
		
		String progNum = request.getParameter("progNum");
		String eduNum = request.getParameter("eduNum");
		String eduCategory = request.getParameter("eduCategory");
		String eduState = request.getParameter("eduState");
		String schoolName = request.getParameter("schoolName");
		String enterDate = request.getParameter("enterDate");
		String graduateDate = request.getParameter("graduateDate");
		
		EduVO eduVo = new EduVO();
		EduDAO eduDao = EduDAO.getInstance();
		
		eduVo.setProgNum(progNum);
		eduVo.setEduNum(eduNum);
		eduVo.setEduCategory(eduCategory);
		eduVo.setEduState(eduState);
		eduVo.setSchoolName(schoolName);
		if(enterDate != "" ) {
			eduVo.setEnterDate(enterDate);
		}
		if(graduateDate != "") {
			eduVo.setGraduateDate(graduateDate);
		}
		
		System.out.println("eduVo : " + eduVo);
		
		eduDao.insertEdu(eduVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
		
		
	}

}
