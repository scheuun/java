package ch07.ex04.case07;

public class Snake implements Animal {
	@Override
	public void eat() {
		System.out.println("삼키다.");
	}
	
	public void move() {
		System.out.println("기어가다.");
	}
}
