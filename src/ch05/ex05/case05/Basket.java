package ch05.ex05.case05;

public class Basket {
	private Apple apple; // 자동초가화 int String 아니여도 됨 apple라는 이름의 Apple데이터타입을 가짐

	public Apple getApple() { // 사과를 꺼냄
		return apple;
	}

	public void setApple(Apple apple) { // 사과를 담음
		this.apple = apple;
	}
}
