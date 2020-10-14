package kr.co.spring.ch01;

import kr.co.spring.ch01.classes1.AudiEngine;
import kr.co.spring.ch01.classes1.BenzEngine;
import kr.co.spring.ch01.classes1.Car;

public class Example01 {

	public static void main(String[] args) {
		
		// ������Ʈ ��ü�� ������ IOC / DI �� ������ ������ ���� �մϴ�.
		
		// main �Լ��� ��?
		//  - Project������ main�̶� �� �ϳ��ۿ� ���� ������ ������(Entry Point)
		
		// IOC�� DI�� ���� ���� : ��� ��ü�� ��� ��������� �ϰ�, ��� ����� �Ǵ����� ������ Ŭ������ ����� �Ѵ�.
		
		// main �Լ����� ��ü�� ����� �Ǵ� ���� ���α׷� ��ü�� new�� �̿��� ��ü�� ����� �ִ� Ŭ������ '������'�� �Ͼ�ϴ�.
		
		Car car1 = new Car(new BenzEngine());
		Car car2 = new Car(new AudiEngine());
		
		car1.start();
		car2.stop();
	}
	
}