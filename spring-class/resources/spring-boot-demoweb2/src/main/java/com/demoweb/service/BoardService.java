package com.demoweb.service;

import java.util.List;

import com.demoweb.entity.BoardAttachEntity;
import com.demoweb.entity.BoardEntity;

public interface BoardService {

	void writeBoard(BoardEntity board);
	void writeBoard2(BoardEntity board);

	BoardEntity findBoardByBoardNo(int boardNo);

	BoardAttachEntity findBoardAttachByAttachNo(int attachNo);

	List<BoardEntity> findAllBoardByPage(int from, int count);

	long findBoardCount();

	void increaseBoardReadCount(BoardEntity board);

	void deleteBoard(int boardNo);

	void updateBoard(BoardEntity board);

}