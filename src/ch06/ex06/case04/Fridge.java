package ch06.ex06.case04;

import ch06.ex06.case03.Appliance;

public abstract class Fridge implements Appliance { // override 안할시 abstract 추상클래스 있으면 일반메소드 안됨
	void play() {} // 일반메소드
}
