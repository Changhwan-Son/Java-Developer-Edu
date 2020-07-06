package kr.co.son.assignment2;

public class BenzCar extends Car{

	

	public BenzCar(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void go() {
		this.engine.turnOn();
		System.out.println("[ Benz ] 차가 앞으로 갑니다.");
		
	}
	
	@Override
	public void stop() {
		System.out.print("[ Benz ]");
		super.stop();
	}
	
	
}
