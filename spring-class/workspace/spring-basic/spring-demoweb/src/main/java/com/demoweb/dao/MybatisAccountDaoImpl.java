package com.demoweb.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.demoweb.dto.Member;

@Repository("mybatisAccountDao")
public class MybatisAccountDaoImpl implements AccountDao {
	
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final String MEMBER_MAPPER = "com.demoweb.mapper.MemberMapper.";
	
	@Override
	public void insertMember(Member member) {
		//sqlSessionTemplate.insert("com.springexample.demoweb.mapper.MemberMapper.insertMember", member);
		sqlSessionTemplate.insert(MEMBER_MAPPER + "insertMember", member);
	}
	
//	@Override
//	public Member selectMemberByIdAndPasswd(Member member2) {
//		HashMap<String, Object> params = new HashMap<>();
//		params.put("memberId", member2.getMemberId());
//		params.put("passwd", member2.getPasswd());
//		
//		Member member = sqlSessionTemplate.selectOne(MEMBER_MAPPER + "selectMemberByIdAndPasswd", params);
//		return member;
//		
//	}
	@Override
	public Member selectMemberByIdAndPasswd(Member member2) {		
		Member member = sqlSessionTemplate.selectOne(MEMBER_MAPPER +
													 "selectMemberByIdAndPasswd2", member2);
		return member;
		
	}

}
