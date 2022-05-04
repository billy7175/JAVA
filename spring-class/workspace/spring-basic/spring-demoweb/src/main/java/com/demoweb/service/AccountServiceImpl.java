package com.demoweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demoweb.common.Util;
import com.demoweb.dao.AccountDao;
import com.demoweb.dto.Member;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	// @Qualifier("jdbcAccountDao")
	// @Qualifier("jdbcTemplateAccountDao")
	@Qualifier("mybatisAccountDao")
	private AccountDao accountDao;

	@Override
	public void registerMemberTx(Member member) {
		String passwd = Util.getHashedString(member.getPasswd(), "SHA-256"); // 암호화 기능 호출
		member.setPasswd(passwd);
		
		accountDao.insertMember(member);
	}

	@Override
	public Member findMemberByIdAndPasswd(Member member) {
		String passwd = Util.getHashedString(member.getPasswd(), "SHA-256"); // 암호화 기능 호출
		member.setPasswd(passwd);
		
		Member confirmedMember = accountDao.selectMemberByIdAndPasswd(member);
		return confirmedMember;
	}

}
