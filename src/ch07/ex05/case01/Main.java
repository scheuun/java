package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>(); // Basket<Apple>타입의 basket변수 생성
		basket.set(new Apple());
		System.out.println(basket.get());
		
		// basket.setE(new Grape()); apple만 가능

		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
