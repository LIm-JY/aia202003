package com.aia.it.board.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.aia.it.board.model.Board;

public class BoardRowMapper implements RowMapper<Board>{

	@Override
	public Board mapRow(ResultSet rs, int rowNum) throws SQLException {
		Board board = new Board();
		board.setBidx(rs.getInt("idx"));
		board.setBtitle(rs.getString("btitle"));
		board.setBmsg(rs.getString("bmsg"));
		board.setBphoto1(rs.getString("bphoto1"));
		board.setBphoto2(rs.getString("bphoto2"));
		board.setBregdate(rs.getDate("bregdate"));
		board.setPidx(rs.getInt("pidx"));
		board.setUname(rs.getString("uname"));
		
		
		
		return null;
	}
	
	
	

}
