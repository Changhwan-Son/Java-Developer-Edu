package kr.co.son.assignment2;

public class BenzEngine extends Engine{

	
	@Override
	public void turnOn() {
		System.out.print("[ Benz 엔진 ] ");
		super.turnOn();
	}
	
	@Override
	public void turnOff() {
		System.out.print("[ Benz 엔진 ] ");
		super.turnOff();
	}
}
