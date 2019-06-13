package com.mms.controller.action.portpolio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.dao.PortpolioDAO;
import com.mms.vo.PortpolioVO;

public class PortpolioRegisterAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
//		  //parameter가져오기 
//		  String progNum = request.getParameter("progNum"); 
//		  String subject = request.getParameter("subject"); 
//		  String organization = request.getParameter("organization"); 
//		  String portCate = request.getParameter("portCate"); 
//		  String portDetailCate = request.getParameter("portDetailCate"); 
//		  String portContents =  request.getParameter("portContents"); 
//		  String portStartDate = request.getParameter("portStartDate"); 
//		  String portEndDate = request.getParameter("portEndDate"); 
//		  String rate = request.getParameter("rate"); 
//		  String portFile = request.getParameter("portFile"); 
//		  String plNum = request.getParameter("plNum");
//		  
//		  PortpolioVO portVo = new PortpolioVO(); 
		
		
		  PortpolioDAO portDao = PortpolioDAO.getInstance();
		  
		  PortpolioVO portVo = (PortpolioVO) request.getAttribute("portVo");
		  System.out.println("  zz  " + portVo);
		  portDao.insertPortpolio(portVo);
		  
		  
//		  portVo.setProgNum(progNum); 
//		  portVo.setSubject(subject);
//		  portVo.setOrganization(organization); 
//		  portVo.setPortCate(portCate);
//		  portVo.setPortDetailCate(portDetailCate);
//		  portVo.setPortStartDate(portStartDate); 
//		  portVo.setPortContents(portContents);
//		  portVo.setPortEndDate(portEndDate); 
//		  portVo.setRate(rate);
//		  portVo.setPortFile(portFile); 
//		  portVo.setPlNum(plNum);
//		  
//		  portDao.insertPortpolio(portVo);
//		  
//		  new ResumeFormAction().execute(request, response);
		 
		
		
//		// 업로드 파일 사이즈
//        int fileSize= 5*1024*1024;
//        // 업로드될 폴더 경로
//        String uploadPath = request.getServletContext().getRealPath("/META-INF/UploadFolder");
//        
//        System.out.println("============ uploadFilePath = " + uploadPath);
//        
//        try {
//            
//            // 파일업로드 
//            MultipartRequest multi = new MultipartRequest
//                    (request, uploadPath, fileSize, "UTF-8", new DefaultFileRenamePolicy());
// 
//            // 파일이름 가져오기
//            String fileName = "";
//            Enumeration<String> names = multi.getFileNames();
//            
//            
//            if(names.hasMoreElements())
//            {
//                String name = names.nextElement();
//                fileName = multi.getFilesystemName(name);
//            }
//        
//				
//			System.out.println("fileName : " + fileName);
//
//            PortpolioDAO portDao = PortpolioDAO.getInstance();
//            PortpolioVO portVo = new PortpolioVO();
//            
//            portVo.setProgNum(multi.getParameter("progNum"));
//            portVo.setSubject(multi.getParameter("subject"));
//            portVo.setOrganization(multi.getParameter("organization"));
//            portVo.setPortCate(multi.getParameter("portCate"));
//            portVo.setPortDetailCate(multi.getParameter("portDetailCate"));
//            portVo.setPortContents(multi.getParameter("portContents"));
//            portVo.setPortStartDate(multi.getParameter("portStartDate"));
//            portVo.setPortEndDate(multi.getParameter("portEndDate"));
//            portVo.setRate(multi.getParameter("rate"));
//            portVo.setPortFile(multi.getParameter("portFile"));
//            portVo.setPlNum(multi.getParameter("plNum"));
//            
//            
//            boolean result = portDao.insertPortpolio(portVo);
//            
//            if(result) {
//               
//            	new IntroduceListAction().execute(request, response);
//            }
//               
//            } catch (Exception e) {
//                
//               e.printStackTrace();
//               System.out.println("글 작성 오류 : " + e.getMessage());
//            }
//        
		  
		  new ResumeFormAction().execute(request, response);
	}
}
