package com.aia.it.board.dao;

import java.util.List;

import com.aia.it.board.model.Board;

public interface BoardDaoInterface {
	
	List<Board> selectTotalList();

	int totalCnt();

	List<Board> selectList(int startRow, int count);

	int insertBoard(Board board);
	
	int editBoard(Board board);

	Board selectByBidx(int bidx);
	
	int boardDelete(Board board);
	
	

}
