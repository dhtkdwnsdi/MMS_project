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
		
		String progNum = request.getParameter("progNum");
		request.setAttribute("progNum", progNum);
		
		String introduce1 = request.getParameter("introduce1");
		request.setAttribute("introduce1", introduce1);
		
		String introduce2 = request.getParameter("introduce2");
		request.setAttribute("introduce2", introduce2);
		
		String introduce3 = request.getParameter("introduce3");
		request.setAttribute("introduce3", introduce3);
		
		String introduce4 = request.getParameter("introduce4");
		request.setAttribute("introduce4", introduce4);
		
		String introFile = request.getParameter("introFile");
		request.setAttribute("introFile", introFile);
		
		ProgrammerVO progVo = new ProgrammerVO();
		
		progVo.setProgNum(progNum);
		progVo.setIntroduce1(introduce1);
		progVo.setIntroduce2(introduce2);
		progVo.setIntroduce3(introduce3);
		progVo.setIntroduce4(introduce4);
		progVo.setIntroFile(introFile);
		
		IntroduceDAO introDao = IntroduceDAO.getInstance();
		introDao.updateIntroduce(progVo);
		
		new IntroduceListAction().execute(request, response);
		
		
	}

}
