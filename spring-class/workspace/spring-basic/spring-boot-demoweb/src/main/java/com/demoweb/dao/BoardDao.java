package com.demoweb.dao;

import java.util.List;

import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

public interface BoardDao {

	void insertBoard(Board board);

	void insertBoardAttach(BoardAttach attach);

	List<Board> selectAllBoardByPage(int first, int last);

	int selectBoardCount();

	Board selectBoardByBoardNo(int boardNo);

	List<BoardAttach> selectBoardAttachByBoardNo(int boardNo);

	BoardAttach selectBoardAttachByAttachNo(int attachNo);

	void updateBoardReadCount(int boardNo);

	void deleteBoard(int boardNo);
	
	void updateBoard(Board board);

}