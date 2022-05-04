package com.demoweb.dao;

import java.util.List;

import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

public interface CommentDao {

	void insertComment(BoardComment comment);
	void updateStep(BoardComment boardComment);
	void updateGroupNo(BoardComment boardComment);	
	void updateComment(BoardComment comment);
	void deleteComment(int commentNo);
	
	List<BoardComment> selectCommentsByBoardNo(int boardNo);
	BoardComment selectCommentByCommentNo(int commentNo);

}