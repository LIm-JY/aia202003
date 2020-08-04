package com.aia.op.board.model;

import java.util.List;

public class BoardListView {

	private int boardTotalCount;
	private int currentPageNumber;
	private List<Board> boardList;
	private int pageTotalCount;
	private int boardCountPerpage;
	private int startRow;

	

	public BoardListView(int boardTotalCount, int currentPageNumber, List<Board> boardList,
			int boardCountPerpage, int startRow) {
		this.boardTotalCount = boardTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.boardList = boardList;
		this.boardCountPerpage = boardCountPerpage;
		this.startRow = startRow;
	}

	public BoardListView() {
	}

	public int getBoardTotalCount() {
		return boardTotalCount;
	}


	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

 
	public List<Board> getBoardList(){
		return boardList;
	}


	public int getPageTotalCount() {
		return pageTotalCount;
	}


	public int getBoardCountPerpage() {
		return boardCountPerpage;
	}


	public int getStartRow() {
		return startRow;
	}


	private void calTotalCount() {
		if (boardTotalCount == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = boardTotalCount / boardCountPerpage;
			System.out.println(boardTotalCount % boardCountPerpage);
			if (boardTotalCount % boardCountPerpage > 0) {
				pageTotalCount++;
			}
			System.out.println(pageTotalCount);
		}
	}

	@Override
	public String toString() {
		return "BoardListView [boardTotalCount=" + boardTotalCount + ", currentPageNumber=" + currentPageNumber
				+ ", boardList=" + boardList + ", pageTotalCount=" + pageTotalCount + ", boardCountPerpage="
				+ boardCountPerpage + ", startRow=" + startRow + "]";
	}
	
	
	

}
