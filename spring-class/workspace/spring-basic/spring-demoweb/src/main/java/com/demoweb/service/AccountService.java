package com.demoweb.service;

import com.demoweb.dto.Member;

public interface AccountService {

	void registerMemberTx(Member member);

	Member findMemberByIdAndPasswd(Member member);

}