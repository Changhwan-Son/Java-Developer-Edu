package kr.co.son.classes4;

public class KiaEngine extends Engine{

	private String engineName;
	public KiaEngine(String engineName) {
		this.engineName = engineName;
	}
	
	@Override
	public void turnOn() {
		System.out.print("[" + this.engineName + "] ");
		super.turnOn();
	}
}
