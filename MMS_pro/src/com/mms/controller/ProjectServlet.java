package com.mms.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mms.controller.action.Action;
import com.mms.controller.action.project.ProjectRegisterAction;
import com.mms.vo.ProjectVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class ProjectServlet
 */
@WebServlet("/proj")
public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		System.out.println("ProjectServlet에서 요청 받음을 확인: " + command);
		
		if(command == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
			
		} else if(command.equals("loginForm")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			
		} else if(command.equals("projectRegister")) {
			
			ServletContext context = getServletContext();
			System.out.println("context: " + context.getContextPath());
			
			String path = context.getRealPath("projectFile");
			
			String encType = "UTF-8";
			int sizeLimit = 20 * 1024 * 1024;
			
			MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, encType, new DefaultFileRenamePolicy());
			
			String projName = multi.getParameter("projName");
			String projCate = multi.getParameter("projCate");
			String projDetailCate = multi.getParameter("projDetailCate");
			String startDuedate = multi.getParameter("startDuedate");
			String endDuedate = multi.getParameter("endDuedate");
			String deadline = multi.getParameter("deadline");
			String contents = multi.getParameter("contents");
			String partiFormCode = multi.getParameter("partiFormCode");
			String fwCode = multi.getParameter("fwCode");
			String dbmsCode = multi.getParameter("dbmsCode");
			String osCode = multi.getParameter("osCode");
			String levelCode = multi.getParameter("levelCode");
			String projFile = multi.getFilesystemName("projFile");
			String progNum = multi.getParameter("progNum");
			
			ProjectVO pVo = new ProjectVO();
			pVo.setProjName(projName);
			pVo.setProjCate(projCate);
			pVo.setProjDetailCate(projDetailCate);
			pVo.setStartDuedate(startDuedate);
			pVo.setEndDuedate(endDuedate);
			pVo.setDeadline(deadline);
			pVo.setContents(contents);
			pVo.setPartiFormCode(partiFormCode);
			pVo.setFwCode(fwCode);
			pVo.setDbmsCode(dbmsCode);
			pVo.setOsCode(osCode);
			pVo.setLevelCode(levelCode);
			pVo.setProjFile(projFile);
			pVo.setProgNum(progNum);
			
			System.out.println("path: " + path);
			System.out.println("fileName: " + projFile);
			System.out.println("pVo: " + pVo);
			
			request.setAttribute("pVo", pVo);
			
			new ProjectRegisterAction().execute(request, response);
		} 
		else if(command.equals("download")) {
//			ServletContext context = getServletContext();
//			System.out.println("context: " + context.getContextPath());
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			String path = "D:\\Project\\MMS_LH\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\MMS_pro\\projectFile\\";
			String fileName = request.getParameter("projFile");
			String file = path + fileName;
			
			
			File f = new File(file);
			if(f.exists()) {
				
				int filesize = (int)f.length();
				byte buff[] = new byte[2048];
				int bytesRead;
				
				try {
					response.setContentType("application/x-msdownload; charset=UTF-8");
					response.setHeader("Content-Disposition", "attachment; filename="+fileName);
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
			ProjectActionFactory af = ProjectActionFactory.getInstance();
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
