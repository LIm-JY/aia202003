package com.aia.op.board.model;

import java.sql.Date;

public class Board {
	
	private int idx;
	private String title;
	private String content;
	private Date regDate;
	private String viewCount;
	public Board(int idx, String title, String content, Date regDate, String viewCount) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.viewCount = viewCount;
	}
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getViewCount() {
		return viewCount;
	}
	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", title=" + title + ", content=" + content + ", regDate=" + regDate
				+ ", viewCount=" + viewCount + "]";
	}
	
	
	

}
