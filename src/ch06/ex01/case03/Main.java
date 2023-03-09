package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run(); // 작성안해도 run작성됨
		lion.run();
		
		leopard.eat();
		//leopard.shout();
		
		//lion.eat();
		lion.shout();		
	}
}
