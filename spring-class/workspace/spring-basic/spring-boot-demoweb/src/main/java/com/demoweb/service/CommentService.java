package com.demoweb.service;

import java.util.List;

import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

public interface CommentService {

	void writeComment(BoardComment comment);
	void writeReComment(BoardComment comment);

	void deleteComment(int commentNo);

	void updateComment(BoardComment comment);

	List<BoardComment> findCommentListByBoardNo(int boardNo);

}