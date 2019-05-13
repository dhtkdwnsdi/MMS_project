package com.mms.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVo;
import com.mms.vo.ProgrammerVO;

public class PortpolioListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();		// java에서 세션을 이용할 때 꼭 작성.
		String url ="profile/portpolioList.jsp";
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");  // 현재 세션의 ProgrammerVO 타입인 LoginUser를 pVo에 대입
		String progNum = pVo.getProgNum();		// pVo의 셋팅된 progNum을 가져와서 progNum 변수에 대입
		
		
		PortpolioDAO portDao = PortpolioDAO.getInstance();
		
		List<PortpolioVo> portpolioList = portDao.selectPortpolio(progNum);
		
		request.setAttribute("portpolioList", portpolioList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
