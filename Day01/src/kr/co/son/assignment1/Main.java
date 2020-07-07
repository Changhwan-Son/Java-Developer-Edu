package kr.co.son.assignment1;

public class Main {
	public static void main(String[] args) {
		
		Liquid liquid1 = new Water();
		Liquid liquid2 = new Milk();
		
		Bean bean1 = new AABean();
		Bean bean2 = new BBBean();
		
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		coffeeMachine.makeCoffee(liquid1, bean1);
		
		coffeeMachine.makeCoffee(liquid1, bean2);
		
		coffeeMachine.makeCoffee(liquid2, bean1);
		
		coffeeMachine.makeCoffee(liquid2, bean2);
		
	}
}
