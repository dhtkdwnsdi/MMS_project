package com.mms.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mms.dao.ApplyStmtDAO;
import com.mms.dao.CertDAO;
import com.mms.dao.PlDAO;
import com.mms.dao.ProjectDAO;
import com.mms.dao.ReceiverMsgDAO;
import com.mms.dao.SenderMsgDAO;
import com.mms.vo.ApplyStmtVO;
import com.mms.vo.CertVO;
import com.mms.vo.PlVO;
import com.mms.vo.ProgrammerVO;
import com.mms.vo.ProjectVO;
import com.mms.vo.ReceiveMsgVO;
import com.mms.vo.SendMsgVO;

/**
 * 메인화면으로 이동시켜주는 기능을 구현한 액션클래스
 * 
 * @author cho
 *
 */

public class MainAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "main.jsp";

		HttpSession session = request.getSession();

		ProgrammerVO pVo = (ProgrammerVO) session.getAttribute("LoginUser"); 
		
		//vo에 셋팅된 속성을 grant만 가져와서 새로운 grant에 대입 (모든 속성 중 grant만 가져오기)
		String grant = pVo.getGrant(); 
		String progNum = pVo.getProgNum();

		// grant 0 : 프로그래머
		if (grant.equals("0")) {

			// 내 프로젝트 신청내역
			ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
			ArrayList<ApplyStmtVO> myApplyAllList = aDao.myApplyStmtAllList(progNum);
			request.setAttribute("myApplyAllList", myApplyAllList);

			ArrayList<ApplyStmtVO> myApplyWaitList = aDao.myApplyStmtWaitList(progNum);
			request.setAttribute("myApplyWaitList", myApplyWaitList);

			// 메세지
			ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
			SenderMsgDAO sDao = SenderMsgDAO.getInstance();

			ArrayList<ReceiveMsgVO> ReceiveMessageList = rDao.ReceiveMessageList(progNum);
			request.setAttribute("ReceiveMessageList", ReceiveMessageList);

			ArrayList<SendMsgVO> SendMessageList = sDao.SendMessageList(progNum);
			request.setAttribute("SendMessageList", SendMessageList);

			// 프로젝트 신청하기
			ProjectDAO pDao = ProjectDAO.getInstance();
			ArrayList<ProjectVO> list = new ArrayList<ProjectVO>();
			list = pDao.projectApplyList();
			request.setAttribute("Plist", list);

			
			
		// grant 1 : PM
		} else 
			if (grant.equals("1")) {

				// 내 프로젝트 내역
				ProjectDAO pDao = ProjectDAO.getInstance();
				ArrayList<ApplyStmtVO> myAllProjectList = new ArrayList<ApplyStmtVO>();
				myAllProjectList = pDao.myAllProjectList(progNum);
				request.setAttribute("aList", myAllProjectList);

				ArrayList<ApplyStmtVO> myProgressProjectList = new ArrayList<ApplyStmtVO>();
				myProgressProjectList = pDao.myProgressProjectList(progNum);
				request.setAttribute("pPList", myProgressProjectList);

				ArrayList<ApplyStmtVO> myEndProjectList = new ArrayList<ApplyStmtVO>();
				myEndProjectList = pDao.myEndProjectList(progNum);
				request.setAttribute("ePList", myEndProjectList);

				// 메세지
				ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
				SenderMsgDAO sDao = SenderMsgDAO.getInstance();

				ArrayList<ReceiveMsgVO> ReceiveMessageList = rDao.ReceiveMessageList(progNum);
				request.setAttribute("ReceiveMessageList", ReceiveMessageList);

				ArrayList<SendMsgVO> SendMessageList = sDao.SendMessageList(progNum);
				request.setAttribute("SendMessageList", SendMessageList);

				// 프로젝트 접수승인
				ApplyStmtDAO aDao = ApplyStmtDAO.getInstance();
				ArrayList<ApplyStmtVO> acceptList = new ArrayList<ApplyStmtVO>();
				acceptList = aDao.applyAcceptList(progNum);
				System.out.println(acceptList);
				request.setAttribute("acceptList", acceptList);

				ArrayList<ApplyStmtVO> allApplyStmt = aDao.allApplyStmt(progNum);
				request.setAttribute("allList", allApplyStmt);

			}

		// grant 2 : 관리자
			else 
				if (grant.equals("2")) {

					
					//자격증
					CertDAO certDao = CertDAO.getInstance();
					ArrayList<CertVO> certList = (ArrayList<CertVO>) certDao.selectCert();
					request.setAttribute("certList", certList);

					

					
					//프로그래밍 언어
					PlDAO plDao = PlDAO.getInstance();
					List<PlVO> plList = plDao.selectPl();
					request.setAttribute("plList", plList);
					
					
					
					// 메세지
					ReceiverMsgDAO rDao = ReceiverMsgDAO.getInstance();
					SenderMsgDAO sDao = SenderMsgDAO.getInstance();

					ArrayList<ReceiveMsgVO> ReceiveMessageList = rDao.ReceiveMessageList(progNum);
					request.setAttribute("ReceiveMessageList", ReceiveMessageList);

					ArrayList<SendMsgVO> SendMessageList = sDao.SendMessageList(progNum);
					request.setAttribute("SendMessageList", SendMessageList);

				}

			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);

		}

	}
