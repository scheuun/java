package ch07.ex04.case06;

public class Cat extends Object implements Animal { // 원래 e~O 생략
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
