package com.demoweb.dao;

import com.demoweb.vo.Member;

public interface AccountDao {

	void insertMember(Member member);

	Member selectMemberByIdAndPasswd(Member member);

}