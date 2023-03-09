package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;// 인터페이스안 멤버변수 private 불가 스콥은 객체 인터페이스는 객체를 만들지 않는다.
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCE_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
} // static이 적당 인터페이스는 객체 생성하지 못한다. 객체는 인스턴스변수만 생성 코드는 불변
