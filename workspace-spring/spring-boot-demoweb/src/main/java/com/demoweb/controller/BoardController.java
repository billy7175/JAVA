package com.demoweb.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.demoweb.common.Util;
import com.demoweb.service.BoardService;
import com.demoweb.ui.ThePager;
import com.demoweb.view.DownloadView;
import com.demoweb.vo.Board;
import com.demoweb.vo.BoardAttach;
import com.demoweb.vo.BoardComment;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {
	
	@Autowired
	@Qualifier("boardService")
	private BoardService boardService;
	
	@RequestMapping(value = "list.action", method = RequestMethod.GET)
	public String list(
			@RequestParam(value = "pageno", required = false, defaultValue = "1")Integer pageNo, Model model) {
		
		int pageSize = 3;	//한 페이지에 표시되는 데이터 개수
//		int from = (pageNo - 1) * pageSize + 1; //해당 페이지에 포함된 시작 글번호
//		int to = from + pageSize;				//해당 페이지에 포함된 마지막 글번호 + 1
		int from = (pageNo - 1) * pageSize;
		int pagerSize = 2;	//한 번에 표시되는 페이지 번호 개수
		String linkUrl = "list.action"; //페이지 번호를 눌렀을 때 이동할 경로
		
		//List<Board> boards = boardService.findAllBoardByPage(from, to);
		List<Board> boards = boardService.findAllBoardByPage(from, pageSize);
		int boardCount = boardService.findBoardCount();
		
		ThePager pager = new ThePager(boardCount, pageNo, pageSize, pagerSize, linkUrl);
		
		//JSP에서 읽을 수 있도록 request객체에 조회된 데이터 저장 (forward 이동이기 때문에)
		model.addAttribute("boards", boards);
		model.addAttribute("pager", pager);
		model.addAttribute("pageno", pageNo);
		
		return "board/list";
	}
	
	@RequestMapping(value = "write.action", method = RequestMethod.GET)
	public String writeForm() {
		return "board/write";
	}
	
	@RequestMapping(value = "write.action", method = RequestMethod.POST)
	public String write(Board board, 
			//@RequestParam(value="attach", required = false) MultipartFile attach) {
			MultipartHttpServletRequest req) {		
		MultipartFile attach = req.getFile("attach");
		
		ArrayList<BoardAttach> attachments = new ArrayList<>();
		if (attach != null && !attach.isEmpty()) {
			//파일 저장
			String savedFileName = Util.makeUniqueFileName(attach.getOriginalFilename()); //고유 파일명 만들기
			String path = 
				req.getServletContext().getRealPath("/WEB-INF/board-upload/" + savedFileName);//저장 경로 만들기
			
			try {
				attach.transferTo(new File(path)); //파일 저장하기
				
				//데이터베이스에 저장할 데이터로 VO 객체 만들기
				BoardAttach attachment = new BoardAttach();
				attachment.setSavedFileName(savedFileName);
				attachment.setUserFileName(attach.getOriginalFilename());
				
				attachments.add(attachment);
			} catch (Exception ex) {				
			}
		}
		
		board.setAttachments(attachments);
		//boardService.writeBoard(board);
		boardService.writeBoard2(board);
		
		return "redirect:list.action";
	}
	
	@RequestMapping(value = "/detail.action", method = RequestMethod.GET)
	public String detail(
			@RequestParam("boardno")int boardNo, 
			@RequestParam("pageno")int pageNo,
			Model model) {
		
		Board board = boardService.findBoardByBoardNo(boardNo);
		if (board == null) {
			return "redirect:list.action";
		}
		
		//조회수 증가 처리
		boardService.increaseBoardReadCount(boardNo);
		board.setReadCount(board.getReadCount() + 1);
		
		model.addAttribute("board", board);
		model.addAttribute("boardno", boardNo);
		model.addAttribute("pageno", pageNo);
		
		return "board/detail";
	}
	
	@RequestMapping(value = "/download.action", method = RequestMethod.GET)
	public View download(
			@RequestParam("attachno")int attachNo,
			Model model) {
		
		BoardAttach attach = boardService.findBoardAttachByAttachNo(attachNo);
		if (attach == null) {
			return null;
		} else {
			model.addAttribute("attach", attach);
			
			DownloadView view = new DownloadView();
			return view;
		}
		
	}
	
	@GetMapping(path = { "/delete.action" })
	public View deleteBoard(@RequestParam(value = "boardno")int boardNo, 
			 				  @RequestParam(value = "pageno")int pageNo) {
		
		boardService.deleteBoard(boardNo);
		
		return new RedirectView(String.format("/board/list.action?pageno=%d", pageNo), true);
		
	}
	
	@GetMapping(path = { "/update.action" })
	public String showUpdateForm(@RequestParam(value = "boardno")int boardNo, 
								 @RequestParam(value = "pageno")int pageNo, 
								 Model model) {
		
		Board board  = boardService.findBoardByBoardNo(boardNo);
		
		model.addAttribute("board", board);
		model.addAttribute("pageno", pageNo);
		
		return "board/update";
	}
	
	@PostMapping(path = { "/update.action" })
	public View updateBoard(Board board, 
							@RequestParam(value = "pageno")int pageNo,
							Model model) {
		
		boardService.updateBoard(board);
		
		return new RedirectView(String.format("/board/detail.action?boardno=%d&pageno=%d", board.getBoardNo(), pageNo), true);
	}
	
}













