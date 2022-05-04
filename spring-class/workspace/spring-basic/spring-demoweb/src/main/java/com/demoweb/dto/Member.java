package com.demoweb.dto;

import java.util.Date;

import lombok.Data;

@Data // getter, setter, ...
public class Member {
	
	private String memberId;
	private String passwd;
	private String email;
	private String userType;
	private boolean active;
	private Date regDate;
	
}
