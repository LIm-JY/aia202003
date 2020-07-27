package board.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import board.dao.BoardDao;
import board.model.Board;
import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import service.Service;

public class BoardServiceImpl implements Service {
	
	MemberDao mdao;
	BoardDao dao;
	@Override
	public String getViewPage(HttpServletRequest request, 
			HttpServletResponse response) {
		
		int resultCnt = 0;
		
		String uid = null;
		String title = null;
		String item= null;
		String content = null;
		String file = null;
		
		Connection conn = null;
		
		
		
		
		try {
			
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			
			if(isMultipart) {
				
				DiskFileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload();
				
				List<FileItem> items = upload.parseRequest(request);
				
				Iterator<FileItem> ite = items.iterator();
				
				 while (ite.hasNext()) {
					 
					 FileItem itemF = ite.next();
					 
					 // isFormField() : text value를 가지는 input 확인
					 
					 if(itemF.isFormField()) {
						 
						 String paramName = itemF.getFieldName();
						 String	paramValue = itemF.getString("utf-8");
						
						 
						 if(paramName.equals("uid")) {
							 uid = paramValue;
						 } else if(paramName.equals("title")) {
							 title = paramValue;
						 } else if(paramName.equals("item")) {
							 item = paramValue;
						 } else if(paramName.equals("content")) {
							 content = paramValue;
						 } else if(paramName.equals("file")) {
							file = paramValue;
						 }
						 
					 } else {
						 
						// 서버 내부의 경로
							String uri = "/upload/users";
		
							//String uri = request.getSession().getServletContext().getInitParameter("uploadPath");
		
							// 시스템의 실제(절대) 경로
							String realPath = request.getSession().getServletContext().getRealPath(uri);
							// System.out.println(realPath);
		
							String newFileName = System.nanoTime() + "_" + itemF.getName();
		
							// 서버의 저장소에 실제 저장
							File saveFile = new File(realPath, newFileName);
							itemF.write(saveFile);
							System.out.println("저장 완료");
							
							file = uri+"/"+newFileName;
		
						 
					 
				 }
				
			}
			System.out.println("타니ㅜㅜㅜ");

			Board board = new Board();
			board.setUserId(uid);
			board.setTitle(title);
			board.setItemCategory(item);
			board.setContent(content);
			board.setFileContentAddr(file);
			
			conn = ConnectionProvider.getConnection();
			
			dao = BoardDao.getInstance();
			
			resultCnt = dao.insertBoard(conn, board);
			
			System.out.println("데이터베이스입력정보확인:"+board);
			request.setAttribute("board", board);
			request.setAttribute("result", resultCnt);
			
			
			
			
			
			
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	
		
		
		return "/WEB-INF/views/board/boardFormWrite.jsp";
	}
	
		
	
	
	
}
