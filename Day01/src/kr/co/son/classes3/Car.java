package kr.co.son.classes3;

// 상속은 항상 is a 관계로 읽어봤을 때 말이 안되면 쓰지 말자. 
public class Car extends Engine{
	// 색상, 가격 
	private Integer price;
	private String color;
	
	public void go() {
		turnOn();		// 자동차에게 시동을 켜라 라고 이야기 하는 것. 시동을 거는건 엔진인데
		System.out.println("자동차가 앞으로 갑니다.");
	}
	
	public void stop() {
		System.out.println("자동차가 앞으로 갑니다");
		turnOff();
	}
	
	
}


// * 엔진 => 자동차의 부품 
//   Car
//벤츠   아우디 

// Car entends Engine
// Benz extends Car 
// 이런식으로 해도 프로그래밍적으로는 문제가 없음
// 잘못된 것임에도 불구하고 잘된 것처럼 보임 - 이런 상황 피해야 

// 상속 : is a 관계 (자식 is a 부모)


// is a 관계 -> 강결합 = 클래스끼리의 관게가 너무 강력하다.
// 					= 하나를 바꾸면 나머지 모든 클래스가 영향을 받는다. 

// 객체지향 프로그래밍
// * 결합도를 낮추고 -> 하나의 클래스가 바뀌더라도 다른 클래스가 영향을 받지 않도록
// --> 실제 사용할 클래스의 이름을 모르면 된다. 
// ---> 추상화된 클래스의 이름만 알면 된다. (상위 개념만 알고 있게 하기)
// BenzEngine 모르고 Engine만 알게하는 느낌 

// * 응집도를 높여라 -> 하나의 클래스를 개발하는 데 집중해라 
// => 확장성과 재사용성이 매우 크게 늘어난다. 


// Has-a 관계,  Use-a 관계 활용하기 
//  갖고있다,     사용한다 

// Has - a 관계 : 멤버 변수 형태로 존재
// Use - a 관계 : 메소드의 매개변수 형태로 존재 