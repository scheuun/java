package ch07.ex04.case07;

public class Cat implements Animal { 
	@Override
	public void eat() {
		System.out.println("씹다.");
	}
	
	public void move() {
		System.out.println("걸어가다.");
	}
	
	
}
