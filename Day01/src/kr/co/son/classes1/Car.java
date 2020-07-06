package kr.co.son.classes1;

// Car 클래스에 무엇이 들어갈까
// 속성, 메소드
// 속성 : 변수 (멤버 변수)
// 기능 : 메소드 (멤버 메소드)
public class Car {
	// 자동차의 속성 
	// 가격, 색상 => 데이터 -> int, double, boolean (상태) 등 기본 자료
	// 엔진 => 자동차의 "부품" -> 클래스 
	
	// 요즘은 int 안쓰고 Integer로 쓰는게 유행이라함...
	private Integer price;
	private String color;
	private Integer cc; 
	
	
	
	public void go() {
		System.out.println("시동을 걸고 ");
		System.out.println("자동차가 앞으로 갑니다." + price);
	}
	
	public void stop() {
		System.out.println("자동차가 멈추고  ");
		System.out.println("시동을 끕니다.");
	}
	// 보통 클래스를 이렇게 만들지는 않음. 
	// 이렇게 만들면 빨리 만들수는 있겠지만 재사용이 힘듦
	// 보통 복붙 많이 사용하면 OOP를 잘 활용하지 못하는 것 
	
	
	
	
}


// 엔진, 창문, 바퀴 등등.. 클래스를 만들어 놓고 Car에 붙여줘야 한다. 
// 이 클래스는 이렇게 안만들 것이기 때문에 잘못된 클래스 

// 이 클래스의 잘못된 점
// 확장성 X, 재사용도 어려움, 코드의 기능적인 분리가 일어나지 않았다. 

// 자바 클래스의 제일 큰 목적 
// A 라는 클래스는 B라는 클래스가 잘 작동하는지 작동하지 않는지 알 필요가 없다.
// -> 코드에 직접적으로 나타나지 않으면 된다. 


// DAO -> Data Access Object
// MVC 패턴 -> Controller, Service, DAO 

// Controller : Request, Response
// DAO : 데이터베이스 접근 객체 

// Controller 에서 데이터와 서비스에 대한 기능을 모두 담당을 하면 ?
// 에러가 났음 -> 에러가 발생한 부분을 확인 -> 한 군데에 몰아져 있으면 찾기가 힘
// 데이터 오류 -> DAO 만 보면 된다.
// 요청 & 응답 오류  -> Controller만 보면 된다. 










