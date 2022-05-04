package com.demoweb.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	
	private String memberId;
	private String passwd;
	private String email;
	private String userType;
	private Date regDate;
	private boolean active;

}
