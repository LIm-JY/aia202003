package com.aia.op.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aia.op.member.model.Member;

@Repository
public class JdbcTemplateMemberDao {

	@Inject
	JdbcTemplate jdbcTemplate;

	public int selectTotalCount() throws SQLException {
		return jdbcTemplate.queryForObject("select count(*) from project.member", Integer.class);
	}

	public List<Member> selectList(int startRow, int count) throws SQLException {

//		List<Member> memberList = new ArrayList<Member>();
//		String sql = "select * from project.member order by uname limit ?, ?";
//		memberList = jdbcTemplate.query(sql,new Object[] {startRow, count}, new MemberRowMapper());
//		return memberList;

		return jdbcTemplate.query("select * from project.member order by uname limit ?, ?",
				new Object[] { startRow, count }, new MemberRowMapper());

	}

	// 회원 추가
	public int insertMember(Member member) throws SQLException {

		return jdbcTemplate.update("INSERT INTO project.member " + "(uid, upw, uname, uphoto ) " + "VALUES (?,?,?,?)",
				new Object[] { member.getUid(), member.getUpw(), member.getUname(), member.getUphoto() });

	}

	// 아이디 중복체크
	public int selectById(String uid) {
		return jdbcTemplate.queryForObject("select count(*) from project.member where uid=?", new Object[] { uid },
				Integer.class);
	}
	
	// 회원 수정
	public int editMember(Member member) {

		return jdbcTemplate.update(
					"update project.member set "
					+ " upw=?, uname=?, uphoto=? "
					+ " where idx=?",
					
				new Object[] { 
						member.getUpw(), 
						member.getUname(), 
						member.getUphoto(),
						member.getIdx()
					});

	}
	
	
	// 회원 삭제
		public int memberDelete(int idx){

			return jdbcTemplate.update(
					"delete from project.member where idx=?",
						
					new Object[] {idx}
							
							);

		}

		public Member selectByIdx(int idx) {
			// TODO Auto-generated method stub
			return jdbcTemplate.queryForObject(
					"select * from project.member where idx=?", 
					new Object[] {idx},
					new MemberRowMapper());
		}
	
	
	
	
	
	
	

}