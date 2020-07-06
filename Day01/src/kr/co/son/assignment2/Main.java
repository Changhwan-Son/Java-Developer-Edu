package kr.co.son.assignment2;
/*
자동차 만들기

차량 관리 클래스 만들기

Car
 - Engine
Benz Audi

             Vehicle
         Car          Moto

BenzCar   AudiCar      Honda      BMW
 */

import kr.co.son.assignment2.AudiEngine;
import kr.co.son.assignment2.BenzEngine;
import kr.co.son.assignment2.Car;

public class Main {
	public static void main(String[] args) {
		
		
		Car car1 = new AudiCar(new BenzEngine());	// 의존성을 주입한다. 
		car1.go();
		
		Car car2 = new BenzCar(new AudiEngine());
		car2.go();
		
		MotorCycle motor1 = new Honda();
		motor1.go();
		motor1.stop();
		
		MotorCycle motor2 = new BMW();
		motor2.go();
		motor2.stop();
	}
}
