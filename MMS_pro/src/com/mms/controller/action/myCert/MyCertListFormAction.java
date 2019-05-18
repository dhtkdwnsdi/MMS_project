package com.mms.controller.action.myCert;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.controller.action.Action;
import com.mms.dao.MyCertDAO;
import com.mms.vo.MyCertVO;
import com.mms.vo.ProgrammerVO;

public class MyCertListFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("액션왓나?");
		
		// java에서 세션을 이용할 때 꼭 작성.
		HttpSession session = request.getSession();     
		
		String url = "profile/myCertList.jsp";

		// 현재 세션의 ProgrammerVO 타입인 LoginUser를 pVo에 대입
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser"); 
		
		// pVo의 셋팅된 progNum을 가져와서 progNum 변수에 대입
		String progNum = pVo.getProgNum(); 
		 
		MyCertDAO myCertDao = MyCertDAO.getInstance();
		
		List<MyCertVO> myCertList = myCertDao.selectMyCert(progNum);
		
		request.setAttribute("myCertList", myCertList);
		
		System.out.println(myCertList);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
