package kr.co.son.assignment2;

public class BMW extends MotorCycle{

	
	@Override
	public void go() {
		System.out.print("[ BMW ] ");
		super.go();
	}
	
	@Override
	public void stop() {
		System.out.print("[ BMW ] ");
		super.stop();
	}
	
}
