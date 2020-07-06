package kr.co.son.classes5;

// 조류(Bird) 클래스는 객체로 만들 필요가 없고, 부모클래스의 역할만 하니까 추상클래스화 시킨다. 
public abstract class Bird {
	
	private double weight;
	
	// fly() 가 오지 못하는 이유 : 하늘 다람쥐는 ...?
	//						   Chicken은 날 수 없어
	public void egg() {
		System.out.println("알을 낳았습니다.");
	}

	// 닭 : 모이를, 참새 : 벌레를 먹어요 
	
	// 조류의 자식클래스들이 뭘 먹을지 모르기 때문에 추상화 
	public abstract void eat();
	

}
