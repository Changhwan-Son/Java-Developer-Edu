package kr.co.spring.myboard.service;

import java.util.List;

import kr.co.spring.myboard.domain.BoardVO;

public interface BoardService {
	// 글 등록 
	public void register(BoardVO board);
	
	// 글 조회 
	public BoardVO get(Long bno);
	
	// 글 전체 조회
	public List<BoardVO> getList();
	
	// 글 수정 modify 
	public void modify(BoardVO boardVO);
	
	// 글 삭제 remove
	public void remove(Long bno);
}
