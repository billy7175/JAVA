package com.demoweb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demoweb.mapper.CommentMapper;
import com.demoweb.vo.BoardComment;

@Repository("commentDao")
public class CommentDaoImpl implements CommentDao {
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public void insertComment(BoardComment boardComment) {
		
		commentMapper.insertComment(boardComment);
	}
	
	@Override
	public void updateStep(BoardComment boardComment) {
		commentMapper.updateStep(boardComment);
	}
	
	@Override
	public void updateGroupNo(BoardComment boardComment) {
		commentMapper.updateGroupNo(boardComment);
	}
	
	@Override
	public void updateComment(BoardComment boardComment) {
		
		commentMapper.updateComment(boardComment);
	}
	
	@Override
	public void deleteComment(int commentNo) {
		
		commentMapper.deleteComment(commentNo);
	}

	@Override
	public List<BoardComment> selectCommentsByBoardNo(int boardNo) {

		List<BoardComment> comments = commentMapper.selectCommentsByBoardNo(boardNo);		
		
		return comments;
	}
	
	@Override
	public BoardComment selectCommentByCommentNo(int commentNo) {

		BoardComment comment = commentMapper.selectCommentByCommentNo(commentNo);		
		
		return comment;
	}

	
	
}








