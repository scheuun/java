package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C(); // 모든 객체는 object 타입을 갖고 있음
		B b = c;
		A a = c;
		Object o = c;
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
	}
}
