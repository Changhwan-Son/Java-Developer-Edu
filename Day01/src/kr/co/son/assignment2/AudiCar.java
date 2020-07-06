package kr.co.son.assignment2;

public class AudiCar extends Car{

	
	public AudiCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go() {
		this.engine.turnOn();
		System.out.println("[ Audi ] 차가 앞으로 갑니다.");
	}
	
	@Override
	public void stop() {
		System.out.print("[ Audi car]");
		super.stop();
	}
}
