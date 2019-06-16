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
		
		
//		  String progNum = request.getParameter("progNum");
//		  request.setAttribute("progNum", progNum);
//		  
//		  String introduce1 = request.getParameter("introduce1");
//		  request.setAttribute("introduce1", introduce1);
//		  
//		  String introduce2 = request.getParameter("introduce2");
//		  request.setAttribute("introduce2", introduce2);
//		  
//		  String introduce3 = request.getParameter("introduce3");
//		  request.setAttribute("introduce3", introduce3);
//		  
//		  String introduce4 = request.getParameter("introduce4");
//		  request.setAttribute("introduce4", introduce4);
//		  
//		  String introFile = request.getParameter("introFile");
//		  request.setAttribute("introFile", introFile);
//		  
//		  ProgrammerVO progVo = new ProgrammerVO();
//		  
//		  progVo.setProgNum(progNum); progVo.setIntroduce1(introduce1);
//		  progVo.setIntroduce2(introduce2); progVo.setIntroduce3(introduce3);
//		  progVo.setIntroduce4(introduce4); progVo.setIntroFile(introFile);
		  
		 IntroduceDAO introDao = IntroduceDAO.getInstance();
		  ProgrammerVO progVo = (ProgrammerVO) request.getAttribute("progVo");
		  
		  introDao.updateIntroduce(progVo);
		  
		  new IntroduceFormAction().execute(request, response);
		 
		/*
		
		
	    // 업로드 파일 사이즈
        int fileSize= 5*1024*1024;
        // 업로드될 폴더 경로
        String uploadPath = request.getServletContext().getRealPath("/META-INF/UploadFolder");
        
        System.out.println("============ uploadFilePath = " + uploadPath);
        
        try {
            
            // 파일업로드 
            MultipartRequest multi = new MultipartRequest
                    (request, uploadPath, fileSize, "UTF-8", new DefaultFileRenamePolicy());
 
            // 파일이름 가져오기
            String fileName = "";
            Enumeration<String> names = multi.getFileNames();
            
            
            if(names.hasMoreElements())
            {
                String name = names.nextElement();
                fileName = multi.getFilesystemName(name);
            }
            
            System.out.println("fileName : " + fileName);

            IntroduceDAO introDao = IntroduceDAO.getInstance();
            ProgrammerVO progVo = new ProgrammerVO();
            
            progVo.setProgNum(multi.getParameter("progNum"));
            progVo.setIntroduce1(multi.getParameter("introduce1"));
            progVo.setIntroduce2(multi.getParameter("introduce2"));
            progVo.setIntroduce3(multi.getParameter("introduce3"));
            progVo.setIntroduce4(multi.getParameter("introduce4"));
            progVo.setIntroFile(multi.getParameter("introFile"));
          
            
            boolean result = introDao.updateIntroduce(progVo);
            
            if(result) {
               
            	new IntroduceListAction().execute(request, response);
            }
               
            } catch (Exception e) {
                
               e.printStackTrace();
                System.out.println("글 작성 오류 : " + e.getMessage());
            }
           
        
        }  */
		
	}
}


