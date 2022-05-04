package com.demoweb.service;

import com.demoweb.vo.Member;

public interface AccountService {

	void registerMemberTx(Member member);

	Member findMemberByIdAndPasswd(Member member);

}