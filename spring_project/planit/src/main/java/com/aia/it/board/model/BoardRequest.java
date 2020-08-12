package com.aia.it.board.model;

import org.springframework.web.multipart.MultipartFile;

public class BoardRequest {
	
	private String btitle; //게시글 제목
	private String bmsg; //게시글 내용
	private MultipartFile bphoto1; //게시글 사진
	private MultipartFile bphoto2; //게시글 사진
	private String uname;//회원 닉네임
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBmsg() {
		return bmsg;
	}
	public void setBmsg(String bmsg) {
		this.bmsg = bmsg;
	}
	public MultipartFile getBphoto1() {
		return bphoto1;
	}
	public void setBphoto1(MultipartFile bphoto1) {
		this.bphoto1 = bphoto1;
	}
	public MultipartFile getBphoto2() {
		return bphoto2;
	}
	public void setBphoto2(MultipartFile bphoto2) {
		this.bphoto2 = bphoto2;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "BoardRequest [btitle=" + btitle + ", bmsg=" + bmsg + ", bphoto1=" + bphoto1 + ", bphoto2=" + bphoto2
				+ ", uname=" + uname + "]";
	}
	
	
	
	
	public Board toBoard() {
		
		return new Board(0, btitle,bmsg);
	}
	
	
	
	
	
	
	
	
	
	

}



