package kr.co.spring.ch01.classes2;

public class Car {
	
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.turnOn();
		System.out.println("�ڵ����� ����մϴ�.");
	}

	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
		engine.turnOff();
	}

}