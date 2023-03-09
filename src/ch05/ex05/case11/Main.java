package ch05.ex05.case11;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		man.eat(new Apple()); // 코드붕복 최소화 따로 선언 안함
		man.eat(new Grape());
	}
}