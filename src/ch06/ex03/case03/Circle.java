package ch06.ex03.case03;

public class Circle extends Point {
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y); // Point에 초기화 맡김
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r); // 일정형식을 갖춘 문자값을 만들어냄 this.r
	}
}
