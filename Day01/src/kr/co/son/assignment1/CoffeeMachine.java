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
	
	// has - a 관계 
	// 클래스의 멤버변수 형태로 존재 
	// 부품의 개념으로 접근 
	
	// use - a 관계 
	// 메소드의 매개변수 형태로 존재 
	// 특정 메소드가 실행될 때마다 받아와야 한다. 
	

	
	// 이렇게 하면 커피머신을 커피를 만들 때마다 새로 장만해야 한다는 의미
	/*
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
	*/
	
	
	// 커피머신이라는 존재는 한대만 장만하고 필요에 따라서 (커피를 만들 때마다) 원두랑 액체를 바꿀 수 있게 해야한다. 
	
	public void makeCoffee(Liquid liquid, Bean bean) {
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



