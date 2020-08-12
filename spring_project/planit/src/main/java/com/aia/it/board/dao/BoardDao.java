package com.aia.it.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.aia.it.board.model.Board;

@Repository
public class BoardDao {
	
	private SqlSessionTemplate sessionTemplate;
	
	
	
	private String mapperPath = "com.aia.op.mybatis.mapper.BoardMapper";
	
	public int insertBoard(Board board) {
		return sessionTemplate.update(mapperPath+".insertBoard"+board);
	}
	

}
