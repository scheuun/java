package ch07.ex04.case03;

public class Ball {
	private int num;
	
	public Ball(int num) { // 블럭내 초기화 DI ( ~ }
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
}
