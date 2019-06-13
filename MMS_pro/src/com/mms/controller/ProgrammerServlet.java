package com.mms.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.ResumeFormAction;
import com.mms.controller.action.memberSet.MemberUpdateFormAction;
import com.mms.controller.action.portpolio.PortpolioRegisterAction;
import com.mms.vo.PortpolioVO;
import com.mms.vo.ProgrammerVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * 
 * @author LEE HAN
 * 
 */

/**
 * Servlet implementation class ProgrammerServlet
 */
@WebServlet("/prog")
public class ProgrammerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProgrammerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String command = request.getParameter("command");
		System.out.println("ProgrammerServlet에서 요청 받음을 확인: " + command);
		
		if(command == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
		} else if(command.equals("loginForm")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} 
		
		// 개인 기초 정보 수정
		else if(command.equals("memberUpdate")) {
			
			ServletContext context = getServletContext();
			System.out.println("context: " + context.getContextPath());
			
			String path = context.getRealPath("photo");
			
			String encType = "UTF-8";
			int sizeLimit = 20 * 1024 * 1024;
			
			
			//첨부파일 받아오는 객체 세팅
			MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
			
			//파라미터 값 받아옴
			String id = multi.getParameter("id");
			String password = multi.getParameter("password");
			String name = multi.getParameter("name");
			String juso = multi.getParameter("juso");
			String extraJuso = multi.getParameter("extraJuso");
			String email = multi.getParameter("email");
			String tel = multi.getParameter("tel");
			String bank = multi.getParameter("bank");
			String account = multi.getParameter("account");
			String photo = multi.getFilesystemName("photo");
			String progNum = multi.getParameter("progNum");
			
			//?
			String prevPhoto = multi.getParameter("prevPhoto");
			String filePath = path + "\\" + prevPhoto;
			
			System.out.println(filePath);
			
			//파일 있으면 지우기
			File f = new File(filePath);
			if(f.exists()) {
				f.delete();
			}
			
			//프로그래머VO 세팅
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
			progVo.setPhoto(photo);
			progVo.setProgNum(progNum);
			
			
			System.out.println("path: " + path);
			System.out.println("fileName: " + photo);
			System.out.println("progVo: " + progVo);
			
			request.setAttribute("progVo", progVo);
			
			new MemberUpdateFormAction().execute(request, response);
			
			
			
		} 
		
		
		else if(command.equals("portpolioRegister")) {

			ServletContext context = getServletContext();
			System.out.println("context: " + context.getContextPath());
			
			String path = context.getRealPath("portFile");
			
			String encType = "UTF-8";
			int sizeLimit = 20 * 1024 * 1024;
			
			//첨부파일 받아오는 객체 세팅
			MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
			
			//parameter가져오기 
			String progNum = multi.getParameter("progNum"); 
			String subject = multi.getParameter("subject"); 
			String organization = multi.getParameter("organization"); 
			String portCate = multi.getParameter("portCate"); 
			String portDetailCate = multi.getParameter("portDetailCate"); 
			String portContents =  multi.getParameter("portContents"); 
			String portStartDate = multi.getParameter("portStartDate"); 
			String portEndDate = multi.getParameter("portEndDate"); 
			String rate = multi.getParameter("rate"); 
			String portFile = multi.getFilesystemName("portFile"); 
			String plNum = multi.getParameter("plNum");
			
			PortpolioVO portVo = new PortpolioVO(); 
			
			portVo.setProgNum(progNum); 
			portVo.setSubject(subject);
			portVo.setOrganization(organization); 
			portVo.setPortCate(portCate);
			portVo.setPortDetailCate(portDetailCate);
			portVo.setPortContents(portContents);
			portVo.setPortStartDate(portStartDate); 
			portVo.setPortEndDate(portEndDate); 
			portVo.setRate(rate);
			portVo.setPortFile(portFile); 
			portVo.setPlNum(plNum);
			
			System.out.println("path: " + path);
			System.out.println("fileName: " + portFile);
			System.out.println("portVo: " + portVo);
			
			request.setAttribute("portVo", portVo);
			
			new PortpolioRegisterAction().execute(request, response);
		} 
		
		
		
		else if(command.equals("portpolioUpdate")) {

			ServletContext context = getServletContext();
			System.out.println("context: " + context.getContextPath());
			
			String path = context.getRealPath("portFile");
			
			String encType = "UTF-8";
			int sizeLimit = 20 * 1024 * 1024;
			
			//첨부파일 받아오는 객체 세팅
			MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
			
			//parameter가져오기 
			String portNum = multi.getParameter("portNum"); 
			String subject = multi.getParameter("subject"); 
			String organization = multi.getParameter("organization"); 
			String portCate = multi.getParameter("portCate"); 
			String portDetailCate = multi.getParameter("portDetailCate"); 
			String portContents =  multi.getParameter("portContents"); 
			String portStartDate = multi.getParameter("portStartDate"); 
			String portEndDate = multi.getParameter("portEndDate"); 
			String rate = multi.getParameter("rate"); 
			String portFile = multi.getFilesystemName("portFile"); 
			String plNum = request.getParameter("plNum");
			
			PortpolioVO portVo = new PortpolioVO(); 
			
			portVo.setPortNum(portNum); 
			portVo.setSubject(subject);
			portVo.setOrganization(organization); 
			portVo.setPortCate(portCate);
			portVo.setPortDetailCate(portDetailCate);
			portVo.setPortContents(portContents);
			portVo.setPortStartDate(portStartDate); 
			portVo.setPortEndDate(portEndDate); 
			portVo.setRate(rate);
			portVo.setPortFile(portFile); 
			portVo.setPlNum(plNum);
			
			System.out.println("path: " + path);
			System.out.println("fileName: " + portFile);
			System.out.println("portVo: " + portVo);
			
			request.setAttribute("portVo", portVo);
			
			new ResumeFormAction().execute(request, response);
		} 
		
		
		
		
		else if(command.equals("portpolioDownload")) {
			
			
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			String path = "D:\\MMS_osj\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\MMS_pro\\portFile\\";
			String fileName = request.getParameter("portFile");
			String file = path + fileName;
			String fileType = fileName.substring(fileName.lastIndexOf(".")+1);
			
			File f = new File(file);
			if(f.exists()) {
				
				int filesize = (int)f.length();
				byte buff[] = new byte[2048];
				int bytesRead;
				
				try {
					if (fileType.equals("hwp")){
						  response.setContentType("application/x-hwp");
						} else if (fileType.equals("pdf")){
						  response.setContentType("application/pdf");
						} else if (fileType.equals("ppt") || fileType.equals("pptx")){
						  response.setContentType("application/vnd.ms-powerpoint");
						} else if (fileType.equals("doc") || fileType.equals("docx")){
						  response.setContentType("application/msword");
						} else if (fileType.equals("xls") || fileType.equals("xlsx")){
						  response.setContentType("application/vnd.ms-excel");
						} else {
						  response.setContentType("application/octet-stream");
						}


					response.setHeader("Content-Disposition","attachment; filename=" + fileName + ";");
					FileInputStream fin = new java.io.FileInputStream(f);
					BufferedInputStream bis = new BufferedInputStream(fin);
					ServletOutputStream fout = response.getOutputStream();
					BufferedOutputStream bos = new BufferedOutputStream(fout);
					
					while((bytesRead = bis.read(buff)) != -1) {
						bos.write(buff, 0, bytesRead);
						
					}
					bos.flush();
					
					fin.close();
					fout.close();
					bis.close();
					bos.close();
					
				} catch (IOException e) {
					response.setContentType("text/html; charset=UTF-8");
					response.getWriter().println("Error : "+e.getMessage());
					
				}
			} else {
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().println("File Not Found : " + file);
				
			}
			
		}
		
		
		
		else {
			ProgrammerActionFactory af = ProgrammerActionFactory.getInstance();
			Action action = af.getAction(command);
			
			if(action != null) {
				action.execute(request, response);
			}
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		doGet(request, response);
	}

}
