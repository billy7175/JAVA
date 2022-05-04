package com.demoweb.vo;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Board {

	private int boardNo;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int readCount;
	private boolean deleted;
	
	//Board - BoardAttach 사이의 1:Many 관계를 구현하는 필드
	private List<BoardAttach> attachments;
	//Board - BoardComment 사이의 1:Many 관계를 구현하는 필드
	private List<BoardComment> comments;
	
	
}
