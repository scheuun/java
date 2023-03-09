package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3; //final을 쓰면 바귀지 않음  Max는 상수가 됨-대문자로 써줌
		//Max = 1; 컴파일 에러
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14; //PI 안바뀜
		int r = 3;
		area = PI * r * r;
	}
}
