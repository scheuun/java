package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		long c = a + b;
		
		System.out.println(c); // 2000000
		
		c = a * b;
		System.out.println(c); // int에서 이미 변해서 담을 수 없음
		
		c = (long)a * b; // 리턴값을 long에 담음
		System.out.println(c);
		
		int x = a * b / a;  // -727 a*b 1조는 int로 안됨
		x = a / b * a; // 1000000
		System.out.println(x);
		
		
		
	}

}
