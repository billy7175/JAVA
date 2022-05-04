package com.demoweb.service;

import java.util.List;

import com.demoweb.entity.BoardCommentEntity;

public interface CommentService {

	void writeComment(int boardNo, BoardCommentEntity comment);
	void writeReComment(BoardCommentEntity comment);

	void deleteComment(int commentNo);

	void updateComment(BoardCommentEntity comment);

	List<BoardCommentEntity> findCommentListByBoardNo(int boardNo);

}