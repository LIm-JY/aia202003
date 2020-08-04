package com.aia.op.board.model;

public class BoardRequest {
	
	private int idx;
	private String title;
	private String content;
	
	
	
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
	
	@Override
	public String toString() {
		return "BoardRequest [idx=" + idx + ", title=" + title + ", content=" + content + "]";
	}
	public Board toBoard() {
		return new Board(0, title, content, null, null);
	}
	
	

}
