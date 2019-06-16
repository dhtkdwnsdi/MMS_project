package com.mms.controller.action.memberSet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.LogoutAction;
import com.mms.dao.SignUpDAO;
import com.mms.vo.ProgrammerVO;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		SignUpDAO sDao = SignUpDAO.getInstance();
		ProgrammerVO progVo = (ProgrammerVO) request.getAttribute("progVo");
		System.out.println("progVo: " + progVo);
		
		sDao.updateUser(progVo);
		
		
       /* int fileSize= 5*1024*1024;
        // 업로드될 폴더 경로
        String uploadPath = request.getServletContext().getRealPath("/META-INF/UploadFolder");
        
        try {
            MultipartRequest multi = new MultipartRequest
                    (request, uploadPath, fileSize, "UTF-8", new DefaultFileRenamePolicy());
            
            //파라미터 값을 가져온다.
    		String id = request.getParameter("id");
    		String password = request.getParameter("password");
    		String name = request.getParameter("name");
    		String juso = request.getParameter("juso");
    		String extraJuso = request.getParameter("extraJuso");
    		String email = request.getParameter("email");
    		String tel = request.getParameter("tel");
    		String bank = request.getParameter("bank");
    		String account = request.getParameter("account");
    		String progNum = request.getParameter("progNum");
    		String photo = request.getParameter("photo"); //첨부파일
            
            //파라미터 값을 자바빈에 세팅한다.
    		ProgrammerVO progVo = new ProgrammerVO();
    		progVo.setId(id);
    		progVo.setPassword(password);
    		progVo.setName(name);
    		progVo.setJuso(juso);
    		progVo.setExtraJuso(extraJuso);
    		progVo.setEmail(email);
    		progVo.setTel(tel);
    		progVo.setBank(bank);
    		progVo.setAccount(account);
    		progVo.setProgNum(progNum);            
     
            //글 수정 시 업로드된 파일 가져오기
            Enumeration<String> fileNames = multi.getFileNames();
            if(fileNames.hasMoreElements()) {
               String fileName = fileNames.nextElement();
               String updateFile = multi.getFilesystemName(fileName);
               if(updateFile == null) //수정시 새로운 파일을 첨부 안했다면 기존파일명 세팅
            	   
                  progVo.setPhoto(photo);
               else
            	   progVo.setPhoto(updateFile);
            }
            
            ProgrammerDAO progDao = ProgrammerDAO.getInstance();
            boolean result = progDao.updateState(progVo);
        
            
            if(result) {
               new AdminTodayBookListAction().execute(request, response);
            }
         
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("글 수정 오류 : " + e.getMessage());
      }*/
   }
		
		
		
	}


