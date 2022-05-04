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

import com.demoweb.service.CommentService;
import com.demoweb.vo.BoardComment;

@Controller
@RequestMapping(value = "/board/")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
		
	@PostMapping(path = { "/write-comment" })
	@ResponseBody
	public String writeComment(BoardComment comment) {
	
		commentService.writeComment(comment);
		
		return "success";		
	}
	
	@PostMapping(path = { "/write-recomment" })
	@ResponseBody
	public String writeReComment(BoardComment comment) {
	
		commentService.writeReComment(comment);
		
		return "success";		
	}
	
	@GetMapping(path = { "/get-comment-list/{boardNo}" })
	public String listComment(@PathVariable int boardNo, Model model) {
		
		List<BoardComment> comments = commentService.findCommentListByBoardNo(boardNo);
		model.addAttribute("comments", comments);
		
		return "board/comments";
	}
	
	@GetMapping(path = { "/delete-comment/{commentNo}" })
	@ResponseBody
	public String deleteComment(@PathVariable int commentNo) {
		
		commentService.deleteComment(commentNo);
		
		return "success";
	}
	
	@PostMapping(path = { "/update-comment" })
	@ResponseBody
	public String updateComment(BoardComment comment) {
		
		commentService.updateComment(comment);
		
		return "success";
	}
	
}













