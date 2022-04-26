package com.demoweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_comment")
@Data
public class BoardCommentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int commentNo;
	@Column(nullable = false)
	private String writer;
	@Column(nullable = false)
	private String content;
	@Column
	private Date regDate = new Date();
	
	@Column(nullable = false)
	private int groupNo;
	@Column(nullable = false)
	private int step;
	@Column
	private int depth = 0;
	@Column
	private boolean deleted = false;
	
}




