package com.aia.op.board.model;

import java.sql.Date;

public class Board {
	
	private int bidx; //게시글 식별번호
	private String btitle; //게시글 제목
	private String bmsg; //게시글 내용
	private String bphoto1; //게시글 사진
	private String bphoto2; //게시글 사진
	private Date bregDate; //게시글 작성일
	private int pidx; // 플래너 식별번호
	private String uname;//회원 닉네임
	
	
	public int getBidx() {
		return bidx;
	}
	public void setBidx(int bidx) {
		this.bidx = bidx;
	}
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
	public String getBphoto1() {
		return bphoto1;
	}
	public void setBphoto1(String bphoto1) {
		this.bphoto1 = bphoto1;
	}
	public String getBphoto2() {
		return bphoto2;
	}
	public void setBphoto2(String bphoto2) {
		this.bphoto2 = bphoto2;
	}
	public Date getBregDate() {
		return bregDate;
	}
	public void setBregDate(Date bregDate) {
		this.bregDate = bregDate;
	}
	public int getPidx() {
		return pidx;
	}
	public void setPidx(int pidx) {
		this.pidx = pidx;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Board(int bidx, String btitle, String bmsg, String bphoto1, String bphoto2, Date bregDate, int pidx,
			String uname) {
		this.bidx = bidx;
		this.btitle = btitle;
		this.bmsg = bmsg;
		this.bphoto1 = bphoto1;
		this.bphoto2 = bphoto2;
		this.bregDate = bregDate;
		this.pidx = pidx;
		this.uname = uname;
	}
	
	
	public Board() {
	}
	
	
	@Override
	public String toString() {
		return "Board [bidx=" + bidx + ", btitle=" + btitle + ", bmsg=" + bmsg + ", bphoto1=" + bphoto1 + ", bphoto2="
				+ bphoto2 + ", bregDate=" + bregDate + ", pidx=" + pidx + ", uname=" + uname + "]";
	}
	public Board toBoard() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
