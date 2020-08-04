package com.aia.op.member.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.op.jdbc.ConnectionProvider;
import com.aia.op.member.dao.JdbcTemplateMemberDao;
import com.aia.op.member.dao.MemberDao;

@Service
public class IdCheckService {

	@Autowired
	private JdbcTemplateMemberDao dao;

	public String checkId(String uid) {

		String result = "N";



			int resultCnt = dao.selectById(uid);

			if (resultCnt < 1) {
				result = "Y";
			}

			// TODO Auto-generated catch block
		
		return result;

	}

}
