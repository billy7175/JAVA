package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.demoweb.dao.BoardDao;
import com.demoweb.dao.BoardDaoImpl;
import com.demoweb.dao.CommentDao;
import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	@Qualifier("commentDao")
	private CommentDao commentDao;	

	@Override
	public void writeComment(BoardComment comment) {
		
		comment.setStep(1);
		comment.setDepth(0);		
		commentDao.insertComment(comment);
		
		comment.setGroupNo(comment.getCommentNo());
		commentDao.updateGroupNo(comment);		
		
	}
	
	@Override
	public void writeReComment(BoardComment comment) {
		BoardComment searchedComment = commentDao.selectCommentByCommentNo(comment.getCommentNo());
		if (searchedComment == null) {
			return;
		}
		
		comment.setGroupNo(searchedComment.getGroupNo());
		comment.setStep(searchedComment.getStep());		
		commentDao.updateStep(comment);
		
		comment.setStep(searchedComment.getStep() + 1);
		comment.setDepth(searchedComment.getDepth() + 1);
		commentDao.insertComment(comment);
		
	}

	@Override
	public void deleteComment(int commentNo) {
		commentDao.deleteComment(commentNo);
	}

	@Override
	public void updateComment(BoardComment comment) {
		commentDao.updateComment(comment);		
	}

	@Override
	public List<BoardComment> findCommentListByBoardNo(int boardNo) {
		List<BoardComment> comments = commentDao.selectCommentsByBoardNo(boardNo);
		return comments;
	}

}











