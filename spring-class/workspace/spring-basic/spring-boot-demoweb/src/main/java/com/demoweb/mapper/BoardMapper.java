package com.demoweb.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

@Mapper
public interface BoardMapper {
	
	void insertBoard(Board board);
	void insertBoard2(Board board);
	void insertBoardAttach(BoardAttach boardAttach);
	List<Board> selectBoardList(HashMap<String, Object> params);
	Board selectBoardByBoardNo(int boardNo);
	Board selectBoardByBoardNo2(int boardNo);
	List<BoardAttach> selectBoardAttachByBoardNo(int boardNo);
	List<BoardComment> selectBoardCommentsByBoardNo(int boardNo);
	
	int selectBoardCount();
	BoardAttach selectBoardAttachByAttachNo(int attachNo);
	void updateBoardReadCount(int boardNo);
	void deleteBoard(int boardNo);
	void updateBoard(Board board);
	
}
