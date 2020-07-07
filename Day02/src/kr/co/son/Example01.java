package kr.co.son;

import kr.co.son.box1.Apple;
import kr.co.son.box1.AppleBox;
import kr.co.son.box1.ObjectBox;
import kr.co.son.box1.Orange;

/*
자바 프로그래머

Spring을 다룰 줄 아는 사람 -> Controller, DAO 는 기본
추가적으로 프로그래머라고 하면 Service를 다룬다. 

Controller - Service - DAO
Service : 프로그램을 만드는 과정 



제네릭스 
잘쓰면 실력 good 

 */


public class Example01 {
	public static void main(String[] args) {
		AppleBox box1 = new AppleBox();
		box1.store(new Apple());
		
		ObjectBox box2 = new ObjectBox();
		box2.store(new Apple());
		box2.store(new Orange());
		box2.store("문자열도 들어가요. ");
		
		// 다운캐스팅을 반드시 진행 해야 한다. 
		String item = (String)box2.get();
		
		// Object 클래스에서 다운캐스팅을 하기 때문에 문제가 발생
		//Orange orange = (Orange)box2.get();
		
		// 다운캐스팅 하기 전에 검사를 해야 한다. 
		Object obj = box2.get();
		
		if(obj instanceof String) {}
		else if (obj instanceof Orange) {}
		else if (obj instanceof Apple) {}
		//.... 박스에 들어갈 클래스가 추가될 때 마다 instanceof 를 써야 한다. 
		
		
	}
}
