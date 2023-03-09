package ch03.ex03;

public class BitWise {
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("%s, %d\n", 
				"0000000000000000000000000000" + Integer.toBinaryString(x),x); // 0 28개
		
		x = ~x;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x),x); // ~1은 0으로 0은 1로
		
		x = x + 1;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x),x);


	}
}
