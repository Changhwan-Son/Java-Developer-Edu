package kr.co.son.classes5;

// 날 수 있는건 참새, 하늘 다람
public class Sparrow extends Bird implements Flyable{

	@Override
	public void eat() {
		// Bird는 뭘 먹을지 몰라서 추상화 했다면, 참새는 벌레를 먹는지 확실하게 알고 있기 때문에 구현이 필요
		System.out.println("벌레 먹음");
	}
	
	
	@Override
	public void fly() {
		System.out.println("참새가 날개로 날아요");
	}
}
