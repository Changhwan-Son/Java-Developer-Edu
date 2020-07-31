package kr.co.spring.myboard.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.spring.myboard.domain.BoardVO;
import kr.co.spring.myboard.service.BoardService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/")
public class BoardController {
	
	@Setter(onMethod_= {@Autowired})
	private BoardService service;
	
	
	// 게시글 전체 조회 ( /list)
	@GetMapping("/list")
	public void list(Model model) {
		// Model을 사용해서 서버의 데이터를 클라이언트에게 전달해 준다. 
		
		model.addAttribute("list", service.getList());
	}
	
	// 게시글 상세 조회 ( /get)
	@GetMapping("/get")
	public void get(@RequestParam("bno")Long bno, Model model) {
		model.addAttribute("board", service.get(bno));		
	}
	
	// 게시글 등록 페이지( /register) - get 방식 
	@GetMapping("/register")
	public void register() {
		
	}
	
	// 게시글 등록 기능 ( /register) - post 방식 
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		
		log.info("BoardController... - register " + board);
		
		service.register(board);
		return "redirect:/board/list";
	}
	

	// 게시물 수정 페이지 
	@GetMapping("/modify")
	public void modify(@RequestParam("bno")Long bno, Model model) {
		model.addAttribute("board", service.get(bno));
		
	}
	
	// 게시물 수정 기능 ( /modify) - post 방식
	@PostMapping("/modify")
	public String modify(String title, String content,BoardVO board, RedirectAttributes rttr) {
		
		board.setTitle(title);
		board.setContent(content);
		
		service.modify(board);
		return "redirect:/board/list";
	}
	
	
	@GetMapping("/remove")
	public String remove(Long bno) {
		
		
		service.remove(bno);
		return "redirect:/board/list";
	}
	
	
	
}


// GET 방식 통신 : url 주소 뒤에 파라미터를 전달한다. 
// POST 방식 통신 : header에 데이터를 숨겨서 보낸다.
//				  보통 많은 양의 데이터, 보안이 필요한 데이터를 POST 방식으로 전달합니다.
