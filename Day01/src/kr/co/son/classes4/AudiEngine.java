package kr.co.son.classes4;

public class AudiEngine extends Engine{

	@Override
	public void turnOn() {
		System.out.print("[아우디] ");
		super.turnOn();
	}
}
