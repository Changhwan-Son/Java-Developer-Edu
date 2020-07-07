package kr.co.son;

import kr.co.son.box1.Apple;
import kr.co.son.box1.Orange;
import kr.co.son.box2.GenericBox;

public class Example02 {

	public static void main(String[] args) {
		
		GenericBox<Apple> appleBox = new GenericBox<>();
		appleBox.store(new Apple());
		
		GenericBox<Orange> orangeBox = new GenericBox<Orange>();
		orangeBox.store(new Orange());
		
		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.store("문자열");
		
		// instanceof를 사용할 필요가 없어졌다. -> 다운캐스팅의 필요성이 사라졌다. 
		Apple apple = appleBox.get();
		Orange orange = orangeBox.get();
		String string = stringBox.get();
	}
}
