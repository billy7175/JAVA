package com.demoweb.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardComment {
	
	private int commentNo;
	private int boardNo;
	private String writer;
	private String content;
	private Date regDate;
	
	private int groupNo;
	private int step;
	private int depth;
	private boolean deleted;
	
}




