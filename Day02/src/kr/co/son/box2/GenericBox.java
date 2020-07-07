package kr.co.son.box2;

// 일반화 시킬 수 있는 박스를 만들 것이다. 
// 제네릭 문법 <글자>
public class GenericBox <T> {	// T라는 문자열을 클래스의 이름으로 치환 
	
	private T t;
	
	public void store(T t) {
		this.t = t;
	}

	public T get() {
		return t; 
	}
}
