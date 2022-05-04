package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demoweb.dao.BoardDao;
import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	@Qualifier("boardDao")
	private BoardDao boardDao;
	
	@Override
	public void writeBoard(Board board) {

		boardDao.insertBoard(board);
		
		//첨부파일 등록하는 구현
		for (BoardAttach attach : board.getAttachments()) {
			attach.setBoardNo(board.getBoardNo());//위에서 등록한 글번호 저장
			boardDao.insertBoardAttach(attach);
		}
		
	}
	
	@Override
	public void writeBoard2(Board board) {

		boardDao.insertBoard(board);
		
		//int x = 10 / 0;
		
		//첨부파일 등록하는 구현
		for (BoardAttach attach : board.getAttachments()) {
			attach.setBoardNo(board.getBoardNo());//위에서 등록한 글번호 저장
			boardDao.insertBoardAttach(attach);
		}
		
	}

	@Override
	public Board findBoardByBoardNo(int boardNo) {
		
		Board board = boardDao.selectBoardByBoardNo(boardNo);
		
		if (board != null) {
			//List<BoardAttach> attachments = boardDao.selectBoardAttachByBoardNo(boardNo);
			//board.setAttachments(attachments);
			
			//List<BoardComment> comments = boardDao.selectCommentByBoardNo(boardNo);
			//board.setComments(comments);			
		}
		
		return board;
		
	}

	@Override
	public BoardAttach findBoardAttachByAttachNo(int attachNo) {
		
		BoardAttach attach = boardDao.selectBoardAttachByAttachNo(attachNo);

		return attach;
	}

	@Override
	public List<Board> findAllBoardByPage(int from, int to) {
		List<Board> boards = boardDao.selectAllBoardByPage(from, to);
		return boards;		
	}

	@Override
	public int findBoardCount() {
		int count = boardDao.selectBoardCount();
		return count;
	}

	@Override
	public void increaseBoardReadCount(int boardNo) {
		
		boardDao.updateBoardReadCount(boardNo);
		
	}

	@Override
	public void deleteBoard(int boardNo) {
		
		boardDao.deleteBoard(boardNo);
		
	}

	@Override
	public void updateBoard(Board board) {
		
		boardDao.updateBoard(board);
		
	}

}











