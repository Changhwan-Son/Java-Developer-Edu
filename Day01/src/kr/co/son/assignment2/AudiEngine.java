package kr.co.son.assignment2;

public class AudiEngine extends Engine{

	
	@Override
	public void turnOn() {
		System.out.print("[ Audi 엔진 ] ");
		super.turnOn();
	}
	
	@Override
	public void turnOff() {
		System.out.print("[ Audi 엔진 ] ");
		super.turnOff();
	}
}

