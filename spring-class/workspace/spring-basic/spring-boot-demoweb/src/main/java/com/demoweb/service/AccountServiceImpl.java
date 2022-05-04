package com.demoweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demoweb.common.Util;
import com.demoweb.dao.AccountDao;
import com.demoweb.vo.Member;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	@Qualifier("accountDao")
	private AccountDao accountDao;

	@Override
	public void registerMemberTx(Member member) {

		String passwd = member.getPasswd();
		passwd = Util.getHashedString(passwd, "SHA-256");
		member.setPasswd(passwd);	
		accountDao.insertMember(member);
		//int x = 10 / 0; // throw new ArithmaticException("/ by zero")

	}

	@Override
	public Member findMemberByIdAndPasswd(Member member) {
		
		String passwd = member.getPasswd();
		passwd = Util.getHashedString(passwd, "SHA-256");
		member.setPasswd(passwd);

		Member member2 = accountDao.selectMemberByIdAndPasswd(member);

		return member2;
	}

}
