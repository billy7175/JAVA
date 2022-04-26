package com.demoweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoweb.entity.MemberEntity;

public interface AccountRepository extends CrudRepository<MemberEntity, String> {
	
	MemberEntity findByMemberIdAndPasswd(String memberId, String passwd);

}
