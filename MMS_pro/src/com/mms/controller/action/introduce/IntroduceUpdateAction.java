package com.mms.controller.action.introduce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.dao.IntroduceDAO;
import com.mms.vo.ProgrammerVO;

public class IntroduceUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 IntroduceDAO introDao = IntroduceDAO.getInstance();
		  ProgrammerVO progVo = (ProgrammerVO) request.getAttribute("progVo");
		  
		  introDao.updateIntroduce(progVo);
		  
		  new IntroduceFormAction().execute(request, response);
		 
	}
}


