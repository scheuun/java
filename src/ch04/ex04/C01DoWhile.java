package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile { // while은 조건문 앞에 do는 뒤에 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do{	// 콘솔에 입력하기 용이 횟수는 모름
			System.out.print("a: "); // presentation logic
			a = sc.nextInt();
			
			System.out.print("b: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", a, b, result = a + b);
		} while(result != 0); // 입력 	처리		출력
	}
}