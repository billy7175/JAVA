package com.demoweb.dao;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demoweb.mapper.MemberMapper;
import com.demoweb.vo.Member;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private MemberMapper memberMapper;	
		
	@Override
	public void insertMember(Member member) {
		memberMapper.insertMember(member);
	}

	@Override
	public Member selectMemberByIdAndPasswd(Member member) {

		HashMap<String, Object> params = new HashMap<>();
		params.put("memberId", member.getMemberId());
		params.put("passwd", member.getPasswd());
		
		Member member2 = memberMapper.selectMemberByIdAndPasswd(params);
		
		return member2;
	}




}




