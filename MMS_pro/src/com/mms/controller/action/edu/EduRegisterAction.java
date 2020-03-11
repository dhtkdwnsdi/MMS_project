package com.mms.controller.action.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;

public class EduRegisterAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String progNum = request.getParameter("progNum");
		String eduNum = request.getParameter("eduNum");
		String eduCategory = request.getParameter("eduCategory");
		String eduState = request.getParameter("eduState");
		String schoolName = request.getParameter("schoolName");
		String major = request.getParameter("major");
		String enterDate = request.getParameter("enterDate");
		String graduateDate = request.getParameter("graduateDate");
		
		EduVO eduVo = new EduVO();
		EduDAO eduDao = EduDAO.getInstance();
		
		eduVo.setProgNum(progNum);
		eduVo.setEduNum(eduNum);
		eduVo.setEduCategory(eduCategory);
		eduVo.setEduState(eduState);
		eduVo.setSchoolName(schoolName);
		eduVo.setMajor(major);
		if(enterDate != "" ) {
			eduVo.setEnterDate(enterDate);
		}
		if(graduateDate != "") {
			eduVo.setGraduateDate(graduateDate);
		}
		
		System.out.println("eduVo : " + eduVo);
		
		eduDao.insertEdu(eduVo);
		
		new ResumeFormAction().execute(request, response);
		
	}

}
