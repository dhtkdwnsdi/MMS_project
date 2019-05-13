package com.mms.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.dao.CareerDAO;
import com.mms.vo.CareerVO;
import com.mms.vo.ProgrammerVO;
/**
 * 
 * @author LEE HAN
 *
 */
public class CareerListFormAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();		// java에서 세션을 이용할 때 꼭 작성.
		String url ="profile/careerListForm.jsp";
		
		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser");  // 현재 세션의 ProgrammerVO 타입인 LoginUser를 pVo에 대입
		String progNum = pVo.getProgNum();		// pVo의 셋팅된 progNum을 가져와서 progNum 변수에 대입
		
		
		CareerDAO cDao = CareerDAO.getInstance();
		
		List<CareerVO> cList = cDao.careerList(progNum);
		
		request.setAttribute("cList", cList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
