package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demoweb.common.Util;
import com.demoweb.mapper.MemberMapper;
import com.demoweb.dto.Member;

import lombok.Setter;

@Service("mapperAccountService")
public class MapperAccountServiceImpl implements AccountService {
	
	@Autowired
	@Qualifier("memberMapper")
	private MemberMapper memberMapper;
	
	@Override
	public void registerMemberTx(Member member) {
		
		member.setPasswd(Util.getHashedString(member.getPasswd(), "SHA-256"));
		// System.out.println(member);
		memberMapper.insertMember(member);
		
	}
	
	@Override
	public Member findMemberByIdAndPasswd(Member member2) {
		
		String passwd = Util.getHashedString(member2.getPasswd(), "SHA-256");
		member2.setPasswd(passwd);
		// System.out.println(memberId);
		
		Member member = memberMapper.selectMemberByIdAndPasswd2(member2);
		return member;
		
	}


}
