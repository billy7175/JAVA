package com.demoweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demoweb.dto.Member;

@Repository("jdbcTemplateAccountDao") // == @Component
public class JdbcTemplateAccountDao implements AccountDao {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertMember(Member member) {
		
		// 3. SQL 작성 + 명령 객체 만들기
		String sql = "INSERT INTO member (memberid, passwd, email) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, member.getMemberId(), member.getPasswd(), member.getEmail());			
		
	}

	@Override
	public Member selectMemberByIdAndPasswd(Member member2) {
		StringBuilder sql = new StringBuilder(128);
		sql.append("SELECT memberid, email, regdate, usertype, active ");
		sql.append("FROM member ");
		sql.append("WHERE memberid = ? and passwd = ? and active = '1'");
		
		Member member = jdbcTemplate.queryForObject(sql.toString(), 
													new RowMapper<Member>() { // 1. RowMapper<Member> 인터페이스 구현 클래스 만들기 + 그 클래스의 인스턴스 만들기

														@Override
														public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
															Member member = new Member();
															member.setMemberId(member2.getMemberId());
															member.setEmail(rs.getString(2));
															member.setRegDate(rs.getDate(3));
															member.setUserType(rs.getString(4));
															member.setActive(rs.getBoolean(5));
															return member;
														}
			
													}, 
													member2.getMemberId(), member2.getPasswd());

		return member;
	}

}
