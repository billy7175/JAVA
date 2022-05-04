package com.demoweb.service;

import java.util.List;

import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

public interface BoardService {

	void writeBoard(Board board);
	void writeBoard2(Board board);

	Board findBoardByBoardNo(int boardNo);

	BoardAttach findBoardAttachByAttachNo(int attachNo);

	List<Board> findAllBoardByPage(int from, int to);

	int findBoardCount();

	void increaseBoardReadCount(int boardNo);

	void deleteBoard(int boardNo);

	void updateBoard(Board board);

}