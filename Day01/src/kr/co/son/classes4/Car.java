package kr.co.son.classes4;



// Car는 엔진을 포함한다. 
//         Engine
// BenzEngine  AudiEngine

public class Car {

	// 속성
	private Integer price;
	private String color;
	
	// 추상화된 카테고리만 알고 있자
	// @Autowired 
	private Engine engine;   // Car 입장에서는 Audi ? Benz? 인지 모름 
	
	// IOC ( Inversion Of Control ) 
	// 필요한 engine 객체를 언제, 누가, 어디서 주는지 모름 
	// 모르기 때문에 더 좋은거임. Car 의 할 일만 잘 할 수 있음 
	// <constructor-args />
	public Car(Engine engine) {		// 의존성을 주입 받는다. 
		this.engine = engine;
	}
	
	// <property />
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	public void go() {
		this.engine.turnOn();			// 엔진이 책임져야 할 부분
		System.out.println("차가 앞으로 갑니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈췄습니다.");
		this.engine.turnOff();
	}
}

// IOC -> Inversion Of Control 
// Control => 객체를 생성하는 시점을 제어 
// 1) Car 클래스를 사용하기 위해 		new 를 이용해서 Car 객체를 만든다. 
// 2) Engine 클래스를 사용하기 위해 	new 를 이용해서 Engine 객체를 만든다. 







// 추상화 (abstract)
// 추상클래스 ? 
// public abstract class A { }
// Spring 에는 추상클래스가 많음 

// * 추상클래스는 객체가 될 수 없다. new를 할 수 없다. 
// * 추상클래스는 무조건 부모 클래스의 역할만 한다.
// * 추상메소드는 무조건 오버라이딩 해야 한다. 
// => 카테고리의 역할만 한다. -> 결합도를 낮추는 방법이 된다. 


// 추상화란?
// 대충 말하는 것 
// * 동물이라는게 있어~ 엔진이라는게 있어~


// interface
// DAO라는게 있어~ 어떤 DAO 인지는 잘 몰라
// Service라는 것도 있어~ 어떤 Service인지는 잘 몰라 

// public interface UserDAO
// public class UserDAOImpl implements UserDAO


// 정의 / 구현
// 정의 : 명패만 만들어 놓는 거 (public void foo(); )
// 구현 : 정의된 메소드를 실제 작동하도록 만드는 것 ( public void foo() { absdfkjfkldkfjs)}


// 추상화 : 구조 잡기 
// 이 구조에서 벗어나면 에러야~
// 추상클래스는 항상 자식에 의해서만 만들어져야 - 실제 구현은 자식클래스에서 한다. 

// 언제 쓰느냐? 부모클래스의 용도로만 사용할 클래스 
// * 상속 : 2~3 단계의 상속만 하는 경우 
// 		   복잡하지 않은 관계 설정을 하는 경우 ( 경험이 말해준다 ) 
// 추상클래스는 언제?
// * 상속은 해야 하는데, 부모클래스가 객체가 될 필요가 없는 경우는 습관적으로 abstract를 붙여서 만들어 준다. 
// 부모클래스가 명확한 역할을 하지 않을 때 => 객체가 될 필요가 없을 때 

// 부모클래스에 속성이 있으면 추상 클래스 
// 부모클래스에 속성이 없으면 인터페이스 

// 추상클래스는 속성 + 개념만 존재하는 내용을 실제화 할 수 있도록 자식클래스가 확장 extends를 써야 한다. 

// 인터페이스는 추상화된 기능(개념)만 존재하기 때문에 자식클래스가 구현할 수 있도록 implements를 쓴
// 인터페이스 :  구현해야 할 목록 











