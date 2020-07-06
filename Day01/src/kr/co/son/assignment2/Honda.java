package kr.co.son.assignment2;

public class Honda extends MotorCycle {

	
	@Override
	public void go() {
		System.out.print("[ Honda ] ");
		super.go();
	}
	
	@Override
	public void stop() {
		System.out.print("[ Honda ] ");
		super.stop();
	}
}
