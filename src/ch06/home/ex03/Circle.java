package ch06.home.ex03;

public class Circle {
	private Point point;
	private int r;
	
	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r); // 일정형식을 갖춘 문자값을 만들어냄
	}
}

//Circle has a point