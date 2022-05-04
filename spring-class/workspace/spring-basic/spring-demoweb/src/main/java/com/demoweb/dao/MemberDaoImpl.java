package com.demoweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.demoweb.dto.Member;

@Repository("jdbcAccountDao") // @Component
public class MemberDaoImpl implements AccountDao {
	
	@Override
	public void insertMember(Member member) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 준비
			// DriverManager.registerDriver(new OracleDriver());
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. 데이터베이스 연결 ( 연결 객체 반환 )
			conn = DriverManager.getConnection("jdbc:oracle:thin:@3.35.21.229:1521:xe",	// 데이터베이스 연결 정보 
											   "demoweb", "oracle");					// 계정 정보 ( id, password )
			
			// 3. SQL 작성 + 명령 객체 만들기
			String sql = "INSERT INTO member (memberid, passwd, email) VALUES (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// 전달인자 처리 코드 작성 위치 
			pstmt.setString(1, member.getMemberId()); 	// SQL의 첫 번째 ?에 적용할 데이터
			pstmt.setString(2, member.getPasswd());		// SQL의 두 번째 ?에 적용할 데이터
			pstmt.setString(3, member.getEmail());		// SQL의 세 번째 ?에 적용할 데이터
			
			// 4. 명령 실행
			pstmt.executeUpdate(); // executeQuery : select sql에 사용, executeUpdate : insert, update, delete 등의 sql 사용 
			
			// 5. 데이터 읽기 ( 결과 있는 경우 - executeQuery )
			
		} catch (Exception ex) {
			ex.printStackTrace(); // 테스트용 오류 로그 표시기
		} finally {
			// 6. 연결 종료
			try { pstmt.close(); } catch (Exception ex) { }
			try { conn.close(); } catch (Exception ex) { }
		}
		
	}
	
	@Override
	public Member selectMemberByIdAndPasswd(Member member2) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Member member = null; // 고유 값 기반 조회이므로 결과는 1개 또는 없음
		
		try {
			// 1. 드라이버 준비
			// DriverManager.registerDriver(new OracleDriver());
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. 데이터베이스 연결 ( 연결 객체 반환 )
			conn = DriverManager.getConnection("jdbc:oracle:thin:@3.35.21.229:1521:xe",	// 데이터베이스 연결 정보 
											   "demoweb", "oracle");					// 계정 정보 ( id, password )
			
			// 3. SQL 작성 + 명령 객체 만들기
			StringBuilder sql = new StringBuilder(128);
			sql.append("SELECT memberid, email, regdate, usertype, active ");
			sql.append("FROM member ");
			sql.append("WHERE memberid = ? and passwd = ? and active = '1'");
			pstmt = conn.prepareStatement(sql.toString());
			// 전달인자 처리 코드 작성 위치 
			pstmt.setString(1, member2.getMemberId()); 	// SQL의 첫 번째 ?에 적용할 데이터
			pstmt.setString(2, member2.getPasswd());		// SQL의 두 번째 ?에 적용할 데이터
			
			// 4. 명령 실행
			rs = pstmt.executeQuery(); // executeQuery : select sql에 사용, executeUpdate : insert, update, delete 등의 sql 사용 
			
			// 5. 데이터 읽기 ( 결과 있는 경우 - executeQuery )
			if (rs.next()) { // 조회 결과가 단일 행인 경우 while 대신 if 사용 가능
				member = new Member();
				member.setMemberId(member2.getMemberId());
				member.setEmail(rs.getString(2));
				member.setRegDate(rs.getDate(3));
				member.setUserType(rs.getString(4));
				member.setActive(rs.getBoolean(5));
			}
			
		} catch (Exception ex) {
			ex.printStackTrace(); // 테스트용 오류 로그 표시기
		} finally {
			// 6. 연결 종료
			try { rs.close(); } catch (Exception ex) { }
			try { pstmt.close(); } catch (Exception ex) { }
			try { conn.close(); } catch (Exception ex) { }
		}
		
		return member;
		
	}

}
