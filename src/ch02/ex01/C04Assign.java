package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;//2데이터 3개 존재
		System.out.printf("%d, %d\n", a, b);
		
		a = b + 1;
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f", d);
	}
}
