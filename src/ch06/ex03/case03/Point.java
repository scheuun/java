package ch06.ex03.case03;

public class Point { // 느슨한 has a 강한 is a
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() { // 자식 private x 작성안돼 getter 생성
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

