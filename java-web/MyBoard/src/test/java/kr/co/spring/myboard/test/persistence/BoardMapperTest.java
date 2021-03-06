package kr.co.spring.myboard.test.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.spring.myboard.domain.BoardVO;
import kr.co.spring.myboard.mapper.BoardMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testBoardMapperBean() {
		assertNotNull(mapper);
	}
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글 - insert");
//		board.setContent("새로 작성하는 내용 - insert");
//		board.setWriter("라이터");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}
//	
	
	
//	@Test
//	public void testInsertKey() {
//		BoardVO board = new BoardVO();
//		
//		board.setTitle("새로 작성하는 글 - insertSelectKey");
//		board.setContent("새로 작성하는 내용 - insertSelectKey");
//		board.setWriter("라이터");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void testRead() {
//		Long bno = 3L;
//		BoardVO board = mapper.read(bno);
//		
//		log.info(bno);
//	}
	
//	@Test
//	public void testModify() {
//		BoardVO board = new BoardVO();
//		board.setBno(3L);
//		board.setTitle("수정 제목");
//		board.setContent("수정 내용");
//		
//		mapper.modify(board);
//		
//	}
//	
	
	@Test
	public void testRemove() {
		mapper.remove(14L);
	}
	
	
	
	
	
}
