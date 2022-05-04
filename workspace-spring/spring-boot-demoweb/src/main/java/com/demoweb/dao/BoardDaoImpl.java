package com.demoweb.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demoweb.mapper.BoardMapper;
import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void insertBoard(Board board) {		
		boardMapper.insertBoard(board);
		//boardMapper.insertBoard2(board);
	}

	@Override
	public void insertBoardAttach(BoardAttach attach) {		
		boardMapper.insertBoardAttach(attach);		
	}

	@Override
	public List<Board> selectAllBoardByPage(int first, int cnt) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("first", first);
		params.put("cnt", cnt);
		
		List<Board> boards = boardMapper.selectBoardList(params);
		
		return boards;
	}
	
	@Override
	public int selectBoardCount() {
		
		int count = boardMapper.selectBoardCount();
		return count;
		
	}


	@Override
	public Board selectBoardByBoardNo(int boardNo) {
		
		//Board board = boardMapper.selectBoardByBoardNo(boardNo);  //Join + Multiple ResultMap
		Board board = boardMapper.selectBoardByBoardNo2(boardNo);	//Multiple Select
		
		return board;//결과 반환
		
	}

	@Override
	public List<BoardAttach> selectBoardAttachByBoardNo(int boardNo) {

		List<BoardAttach> attachments = boardMapper.selectBoardAttachByBoardNo(boardNo);
		
		return attachments;//결과 반환
	}
	
	/////////////////////////////////////////////////////////////
	
	@Override
	public BoardAttach selectBoardAttachByAttachNo(int attachNo) {
		
		BoardAttach attachment = boardMapper.selectBoardAttachByAttachNo(attachNo);
		
		return attachment;
		
	}
	
	@Override
	public void updateBoardReadCount(int boardNo) {
		
		boardMapper.updateBoardReadCount(boardNo);
		
	}
	
	@Override
	public void deleteBoard(int boardNo) {
		
		boardMapper.deleteBoard(boardNo);
		
	}
	
	@Override
	public void updateBoard(Board board) {

		boardMapper.updateBoard(board);
		
	}
	
}