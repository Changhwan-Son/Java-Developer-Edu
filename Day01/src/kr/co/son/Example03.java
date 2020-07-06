package kr.co.son;

import kr.co.son.classes4.Car;
import kr.co.son.classes4.KiaEngine;
import kr.co.son.classes4.AudiEngine;
import kr.co.son.classes4.BenzEngine;

public class Example03 {
	public static void main(String[] args) {
		
		
		// DI ( Dependency Injection ) 의존성 주입 
		// 의존 : 나는 ~ 없으면 안돼!
		// 자동차는 엔진이 없으면 안돼! 
		Car car1 = new Car(new BenzEngine());	// 의존성을 주입한다. 
		car1.go();
		
		Car car2 = new Car(new AudiEngine());
		car2.go();
		
		Car car3 = new Car(new KiaEngine("K5"));
		car3.go();
	}
}
