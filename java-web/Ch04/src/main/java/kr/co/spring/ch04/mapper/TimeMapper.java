package kr.co.spring.ch04.mapper;

import org.apache.ibatis.annotations.Select;

// 쿼리(SQL)문장과 그 쿼리를 실행할 메소드를 지정하는 것을 Mapping 이라고 한다. 
public interface TimeMapper {
	
	// myBatis는 2가지 매핑 방식을 지정한다. 
	// 1) 직접 인터페이스에 쿼리를 입력하는 방식 -> 굉장히 간단한 한줄짜리 쿼리일 경우 사용하면 좋다. 
	@Select("select now()")
	public String getTime();
	
	// 2) xml 리소스를 활용해서 쿼리를 지정하는 방식 
	// resource/mybatis 쿼리를 입력 (xml) 
	// 이 방식을 훨씬 많이 사용한다. 
	public String getTime2();
	
	
}
