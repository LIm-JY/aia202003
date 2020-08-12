package com.aia.it.board.model;

import org.springframework.web.multipart.MultipartFile;

public class BoardEditRequest {
	
	private int bidx;
	private String btitle; //게시글 제목
	private String bmsg; //게시글 내용
	private MultipartFile bphoto1; //게시글 사진
	private MultipartFile bphoto2; //게시글 사진
	private String oldFile;
	
	
	
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
	public String getOldFile() {
		return oldFile;
	}
	public void setOldFile(String oldFile) {
		this.oldFile = oldFile;
	}
	
	public Board toBoard() {
		return new Board(bidx,btitle,bmsg,oldFile.length()>0?oldFile:null, null ,null , 0, null);
	}
	
	
	@Override
	public String toString() {
		return "BoardEditRequest [btitle=" + btitle + ", bmsg=" + bmsg + ", bphoto1=" + bphoto1 + ", bphoto2=" + bphoto2
				+ ", oldFile=" + oldFile + "]";
	}
	
	
	
	

}
