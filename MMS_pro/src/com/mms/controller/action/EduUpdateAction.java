package com.mms.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;

public class EduUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String eduNum = request.getParameter("eduNum");
		request.setAttribute("eduNum", eduNum);
		
		String eduCategory = request.getParameter("eduCategory");
		request.setAttribute("eduCategory", eduCategory);
		
		String eduState = request.getParameter("eduState");
		request.setAttribute("eduState", eduState);
		
		String schoolName = request.getParameter("schoolName");
		request.setAttribute("schoolName", schoolName);
		
		String enterDate = request.getParameter("enterDate");
		request.setAttribute("enterDate", enterDate);
		
		String graduateDate = request.getParameter("graduateDate");
		request.setAttribute("graduateDate", graduateDate);
		
		EduVO eduVo = new EduVO();
		
		eduVo.setEduNum(eduNum);
		eduVo.setEduCategory(eduCategory);
		eduVo.setEduState(eduState);
		eduVo.setSchoolName(schoolName);
		eduVo.setEnterDate(enterDate);
		eduVo.setGraduateDate(graduateDate);
		
		EduDAO eduDao = EduDAO.getInstance();
		eduDao.updateEdu(eduVo);
		
		new EduListFormAction().execute(request, response);
		
	}

}
