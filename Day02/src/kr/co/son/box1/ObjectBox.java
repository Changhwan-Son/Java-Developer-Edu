package kr.co.son.box1;

// 자바에 존재하는 모든 것을 담아낼 수 있는 박스 
// ObjectBox는 특정 클래스에 대해 일반화 되어있지 않다. 어느 클래스나 다 들어올 수 있다.  => 다운캐스팅을 해야 한다. 
public class ObjectBox {


	private Object object;
	
	public void store(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
