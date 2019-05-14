package com.mms.controller.action.edu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.EduDAO;
import com.mms.vo.EduVO;

public class EduDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		EduVO eduVo = new EduVO();
		
		String eduNum = request.getParameter("eduNum");
		
		System.out.println(eduNum);
		
		eduVo.setEduNum(eduNum);
		
		EduDAO eduDao = EduDAO.getInstance();
		
		eduDao.deleteEdu(eduNum);
		
		new EduListFormAction().execute(request, response);
	}

}
