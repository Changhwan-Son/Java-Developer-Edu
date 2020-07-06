package kr.co.son;

import kr.co.son.classes2.Animal;
import kr.co.son.classes2.Lion;
import kr.co.son.classes2.Rabbit;

public class Example01 {
	
	public static void main(String[] args) {
		// Lion 만들어 보기 
		Lion lion = new Lion();
		lion.eat();
		lion.sleep();
		lion.hunt();
		
		Animal animal = new Lion();
		animal.eat();
		animal.sleep();
		// animal.hunt();  // X
		
		// 동물은 사자다 X, 이 동물은 사자다 O
		//              이 동물이 애초에 사자여야만 한다. 
		
		// DownCasting
//		Animal animal2 = new Animal(); 		// 동물은 만들어 놓고 
//		Lion lion2 = (Lion)animal2;			// 멋대로 사자라고 부르는 것 (오류)
		
		Lion lion2 = (Lion)animal;
		
		//Rabbit rabbit = (Rabbit)animal;		// error!
		
		// 다운캐스팅을 언제 써먹냐 => 기능의 사용처가 제한적이고 확실한 클래스만 사용해야 할 때 (확장성을 일부 포기)
		
		
		// instanceof를 이용한 다운캐스팅
		if(animal instanceof Rabbit) {
			System.out.println("이 동물은 토끼입니다.");
		}else if(animal instanceof Lion) {
			System.out.println("이 동물은 사자입니다.");
		}//else if(animal instanceof Tiger) {}
		
		
	}
}





