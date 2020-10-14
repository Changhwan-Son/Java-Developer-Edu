package kr.co.spring.ch01;

import kr.co.spring.ch01.classes2.Car;
import kr.co.spring.ch01.classes2.CarFactory;

public class Example02 {

	public static void main(String[] args) {
		// main���� ���� �ڵ����� ����� ���� �ƴϴ�.
		
		// �ڵ��� ������ ������
//		CarFactory carFactory = new CarFactory();	// ������ ���Ⱑ SingleTon ������ ������ ���� �Ǿ�� �Ѵ�.
		CarFactory carFactory = CarFactory.getInstance();
		
		// ���忡 �ڵ����� �޶�� ��û( �Լ� ȣ�� ) - Bean ȣ��
		Car car = carFactory.car();
		
		car.start();
		
		
		
	}
	
}