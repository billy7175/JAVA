package com.demoweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoweb.common.Util;
import com.demoweb.entity.MemberEntity;
import com.demoweb.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public void registerMemberTx(MemberEntity member) {

		String passwd = member.getPasswd();
		passwd = Util.getHashedString(passwd, "SHA-256");
		member.setPasswd(passwd);	
		accountRepository.save(member);
		//int x = 10 / 0; // throw new ArithmaticException("/ by zero")

	}

	@Override
	public MemberEntity findMemberByIdAndPasswd(MemberEntity member) {
		
		String passwd = member.getPasswd();
		passwd = Util.getHashedString(passwd, "SHA-256");
		member.setPasswd(passwd);

		MemberEntity member2 = accountRepository.findByMemberIdAndPasswd(member.getMemberId(), member.getPasswd());

		return member2;
	}

}
