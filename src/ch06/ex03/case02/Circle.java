package ch06.ex03.case02;

public class Circle {
	private int x;
	private int y;
	private int r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r); // 일정형식을 갖춘 문자값을 만들어냄
	}
}
