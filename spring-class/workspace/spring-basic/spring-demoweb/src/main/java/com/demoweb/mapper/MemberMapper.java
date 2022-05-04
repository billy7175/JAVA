package com.demoweb.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.demoweb.dto.Member;

// MapperInterface - 대상 Mapper.xml 파일과 패키지, 파일이름, 내부의 메서드 이름 및 전달인자가 일치하도록 구현
@Mapper // MemberMapper 인터페이스를 구현하는 클래스를 만들도록 요구하는 annotation 
        // --> SqlSessionTemplate을 사용해서 MyBatis 기능을 호출하는 클래스 
		// --> DAO와 같은 역할 수행
public interface MemberMapper {
	
	void insertMember(Member member);
	Member selectMemberByIdAndPasswd(HashMap<String, Object> params);
	Member selectMemberByIdAndPasswd2(Member member);

}
