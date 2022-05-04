package com.demoweb.service;

import com.demoweb.entity.MemberEntity;

public interface AccountService {

	void registerMemberTx(MemberEntity member);

	MemberEntity findMemberByIdAndPasswd(MemberEntity member);

}