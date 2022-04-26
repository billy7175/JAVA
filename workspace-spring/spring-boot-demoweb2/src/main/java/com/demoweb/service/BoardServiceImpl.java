package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoweb.entity.BoardAttachEntity;
import com.demoweb.entity.BoardEntity;
import com.demoweb.repository.BoardRepository;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public void writeBoard(BoardEntity board) {

		boardRepository.save(board);		
	}
	
	@Override
	public void writeBoard2(BoardEntity board) {

		boardRepository.save(board);
		
		//int x = 10 / 0;
		
//		//첨부파일 등록하는 구현
//		for (BoardAttach attach : board.getAttachments()) {
//			attach.setBoardNo(board.getBoardNo());//위에서 등록한 글번호 저장
//			boardDao.insertBoardAttach(attach);
//		}
		
	}

	@Override
	public BoardEntity findBoardByBoardNo(int boardNo) {
		
		BoardEntity board = boardRepository.findById(boardNo).orElse(null);
		
		if (board != null) {
			//List<BoardAttach> attachments = boardDao.selectBoardAttachByBoardNo(boardNo);
			//board.setAttachments(attachments);
			
			//List<BoardComment> comments = boardDao.selectCommentByBoardNo(boardNo);
			//board.setComments(comments);			
		}
		
		return board;
		
	}

	@Override
	public BoardAttachEntity findBoardAttachByAttachNo(int attachNo) {
		
		BoardAttachEntity attach = boardRepository.findBoardAttachByAttachNo(attachNo);

		return attach;
	}

	@Override
	public List<BoardEntity> findAllBoardByPage(int from, int count) {
		
		List<BoardEntity> boards = boardRepository.findAllWithPaging(from, count);
		return boards;		
	}

	@Override
	public long findBoardCount() {
		long count = boardRepository.count();
		return count;
	}

	@Override
	public void increaseBoardReadCount(BoardEntity board) {
		
		boardRepository.save(board);
		
	}

	@Override
	public void deleteBoard(int boardNo) {
		
		boardRepository.deleteById(boardNo);
		
	}

	@Override
	public void updateBoard(BoardEntity board) {
		BoardEntity prev = boardRepository.findById(board.getBoardNo()).orElse(null);
		if (prev != null) {
			prev.setTitle(board.getTitle());
			prev.setContent(board.getContent());
			boardRepository.save(prev);
		}
	}

}











