package com.demoweb.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demoweb.vo.Member;

@Mapper
public interface MemberMapper {
	
	void insertMember(Member member);
	List<Member> selectMembers();
	Member selectMemberById(String memberId);
	Member selectMemberByIdAndPasswd(HashMap<String, Object> params);

}
