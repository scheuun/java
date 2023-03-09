package ch07.ex01.case07;

public class Human {
	/*
	public void eat(Ramen ramen) { }
	public void eat(Kimchi kimchi) { }
	public void eat(Apple apple) { }
	*/
	
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	} // toString 객체 호출
}
// Overloading 중복-유지보수 어려움