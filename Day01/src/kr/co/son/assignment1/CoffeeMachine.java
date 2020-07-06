package kr.co.son.assignment1;


/*
커피머신 만들기

커피머신에다가 액체, 원두를 집어 넣어서 커피를 만들어요

  액체 : 물, 우유
  원두 : 2~3 종류의 원두를 집어 넣어요

 makeCoffee 함수를 실행 -> 물, 원두 -> 아메리카노 ( xx 원두를 사용한 아메리카노에요 )
                                       우유, 원두 -> 라떼 ( xx 원두를 사용한 라떼에요 )
 hint : instanceof 를 활용해 주세요, downcasting
 
 */
public class CoffeeMachine {
	
	private Liquid liquid;
	private Bean bean;
	
	public CoffeeMachine(Liquid liquid, Bean bean) {
		this.liquid = liquid;
		this.bean = bean;
	}
	
	public void set(Liquid liquid, Bean bean) {
		this.liquid = liquid;
		this.bean = bean;
	}
	
	public void makeCoffee() {
		if(bean instanceof AABean)
			System.out.print("AA 원두를 사용한 ");
		else if(bean instanceof BBBean)
			System.out.print("BB 원두를 사용한 ");
		
		if(liquid instanceof Water)
			System.out.println("아메리카노에요.");
		else if(liquid instanceof Milk)
			System.out.println("라떼에요.");
	}
	
}



