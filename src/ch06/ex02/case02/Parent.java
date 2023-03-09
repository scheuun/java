package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String name;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	
	public String getName() {
		return name;
	}
	
	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) { // 같은 패키지내 돈줄 수 있음
		this.money += money;
	}
}
