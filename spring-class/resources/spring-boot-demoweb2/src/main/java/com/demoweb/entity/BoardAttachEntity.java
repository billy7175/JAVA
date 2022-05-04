package com.demoweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_attach")
@Data
public class BoardAttachEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int attachNo;
	
	@Column(nullable = false)
	private String userFileName;
	
	@Column(nullable = false)
	private String savedFileName;	

}
