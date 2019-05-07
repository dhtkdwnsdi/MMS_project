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

		String url = "/profile?command=eduListForm";
		
		// EdVO 객체 생성
		EduVO eduVo = new EduVO();

		// 요청 된 jsp 에서 Parameter 가져오기
		String eduCategory = request.getParameter("eduCategory");
		String eduState = request.getParameter("eduState");
		String schoolName = request.getParameter("schoolName");
		String enterDate = request.getParameter("enterDate");
		String graduateDate = request.getParameter("graduateDate");

		// Parameter 출력
		System.out.println("eduCategory : " + eduCategory);
		System.out.println("eduState : " + eduState);
		System.out.println("schoolName : " + schoolName);
		System.out.println("enterDate : " + enterDate);
		System.out.println("graduateDate : " + graduateDate);


		// 객체 세팅
		eduVo.setEduCategory(eduCategory);
		eduVo.setEduState(eduState);
		eduVo.setSchoolName(schoolName);
		eduVo.setEnterDate(enterDate);
		eduVo.setGraduateDate(graduateDate);

		EduDAO eduDao = EduDAO.getInstance();

		eduDao.insertEdu(eduVo);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
