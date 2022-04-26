package com.demoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoweb.entity.BoardCommentEntity;
import com.demoweb.repository.CommentRepository;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public void writeComment(int boardNo, BoardCommentEntity comment) {
		
		comment.setStep(1);
		comment.setDepth(0);
		commentRepository.save(comment);
		
		commentRepository.updateGeneratedData(boardNo, comment.getCommentNo());
//		
//		comment.setGroupNo(comment.getCommentNo());
//		commentRepository.save(comment);	
		
	}
	
	@Override
	public void writeReComment(BoardCommentEntity comment) {
		BoardCommentEntity searchedComment = commentRepository.findById(comment.getCommentNo()).orElse(null);
		if (searchedComment == null) {
			return;
		}
		
		comment.setGroupNo(searchedComment.getGroupNo());
		comment.setStep(searchedComment.getStep());
		commentRepository.save(comment);
		
		comment.setStep(searchedComment.getStep() + 1);
		comment.setDepth(searchedComment.getDepth() + 1);
		commentRepository.save(comment);
		
	}

	@Override
	public void deleteComment(int commentNo) {
		commentRepository.deleteById(commentNo);
	}

	@Override
	public void updateComment(BoardCommentEntity comment) {
		BoardCommentEntity prev = commentRepository.findById(comment.getCommentNo()).orElse(null);
		if (prev != null) {
			prev.setContent(comment.getContent());
			commentRepository.save(prev);	
		}
	}

	@Override
	public List<BoardCommentEntity> findCommentListByBoardNo(int boardNo) {
		List<BoardCommentEntity> comments = commentRepository.findByBoardNo(boardNo);
		return comments;
	}

}











