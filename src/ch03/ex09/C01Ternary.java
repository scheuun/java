package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
										//	리턴값 1, 리턴값 2
		int absX = (x >= 0) ? x : -x;  // ?, :삼항연산자  절댓값 구하기 ()안이 조건문이 결과값 boolean타입 리턴
		int absY = (y >= 0) ? y : -y;  // 뒤에는 상수, 변수, 메소드 올 수 있음
		
		System.out.printf("absX: %d\nabsY: %d", absX, absY);
	}
}
