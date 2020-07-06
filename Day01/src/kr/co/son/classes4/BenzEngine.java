package kr.co.son.classes4;

public class BenzEngine extends Engine{

	@Override
	public void turnOn() {
		System.out.print("[벤츠] ");
		super.turnOn();
	}
}
