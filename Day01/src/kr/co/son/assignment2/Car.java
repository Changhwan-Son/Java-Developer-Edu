package kr.co.son.assignment2;

public class Car extends Vehicle{

	protected Engine engine;
	
	public Car(Engine engine) {
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
