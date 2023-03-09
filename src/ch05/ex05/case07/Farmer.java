package ch05.ex05.case07;

public class Farmer { // 주체 객체
	public Apple sell(int price) { // (행동시작데이터) {결과데이터}
		Apple apple = new Apple(); // 사과 생산
		apple.setPrice(price);
		
		return apple;
	}
}
