package com.demoweb.entity;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "tbl_board")
@Data
public class BoardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int boardNo;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String writer;
	@Column(nullable = false)
	private String content;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDate = new Date();
	@Column
	private int readCount = 0;
	@Column
	private boolean deleted = false;
		
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "boardNo")
	private Collection<BoardAttachEntity> attachments;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "boardNo")
	private Collection<BoardCommentEntity> comments;
	
	
}
