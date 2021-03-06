package kr.co.spring.ch01.classes2;

// 자동차 객체를 생성하는 공장의 역할을 하는 '팩토리 클래스' (Container)
//  메인에서 자동차를 만들어 달라는 요청이 오면, 알맞는 자동차를 만들어서 메인에게 자동차를 전달(return) 하는 역할을 할 것

// IOC ( Inversion Of Control )의 시작
// Car 클래스에 대한....
public class CarFactory {

	// CarFactory를 SingleTon으로 만들기
	private static CarFactory instance = null;
	public static final CarFactory getInstance() {
		
		// 최초 요청이면 새롭게 객체를 만든다.
		if (instance == null) {
			instance = new CarFactory();
		}
		// 기존에 있었던 객체를 리턴한다.
		return instance;
	}

	public Car car() {
		// Car에 대한 DI( Dependency Injection )
		return new Car(benzEngine());
	}

	public BenzEngine benzEngine() {
		return new BenzEngine();
	}

}
