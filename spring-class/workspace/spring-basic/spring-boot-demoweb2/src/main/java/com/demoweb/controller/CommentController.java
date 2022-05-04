package com.demoweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demoweb.entity.BoardCommentEntity;
import com.demoweb.service.CommentService;

@Controller
@RequestMapping(value = "/board/")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping(path = { "/write-comment" })
	@ResponseBody // 메서드의 반환값이 view 이름이 아니고 응답컨텐츠입니다.
	public String writeComment(int boardNo, BoardCommentEntity comment) {
	
		commentService.writeComment(boardNo, comment);
		
		return "success";		
	}
	
	@PostMapping(path = { "/write-recomment" })
	@ResponseBody
	public String writeReComment(BoardCommentEntity comment) {
	
		commentService.writeReComment(comment);
		
		return "success";		
	}
	
	@GetMapping(path = { "/get-comment-list/{boardNo}" })
	public String listComment(@PathVariable int boardNo, Model model) {
		
		List<BoardCommentEntity> comments = commentService.findCommentListByBoardNo(boardNo);
		model.addAttribute("comments", comments);
		
		return "board/comments";
	}
	
	@GetMapping(path = { "/delete-comment/{commentNo}" })
	@ResponseBody
	public String deleteComment(@PathVariable int commentNo) { // @PathVariable : 요청 경로의 일부를 데이터로 읽는 annotation
		
		commentService.deleteComment(commentNo);
		
		return "success";
	}
	
	@PostMapping(path = { "/update-comment" })
	@ResponseBody
	public String updateComment(BoardCommentEntity comment) {
		
		commentService.updateComment(comment);
		
		return "success";
	}
	
	/////////////////////////////
	
	// 객체를 반환하는 Ajax 응답 -> 객체를 JSON으로 변환해서 응답 -> JSON 변환은 자동
	@GetMapping(path = { "/get-comment-list2/{boardNo}" }, produces = "application/json;charset=utf-8")
	@ResponseBody
	public List<BoardCommentEntity> listComment2(@PathVariable int boardNo, Model model) {
		
		List<BoardCommentEntity> comments = commentService.findCommentListByBoardNo(boardNo);
		
		return comments; // @ResponseBody + 객체 return -> JSON 응답 ( JSON Serialization 자동 처리 )
	}
	
}













