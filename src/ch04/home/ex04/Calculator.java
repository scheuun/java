package ch04.home.ex04;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine(); // 다음 쓸것이 line 이므로 청소 int면 안씀
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("계속할까요(y/n)? ");
			isRepeat = sc.nextLine().charAt(0);
		} while (isRepeat == 'y');
	
		System.out.println("끝.");
	}
}



/*
 계산기를 만들어라 
 연산다 +, -, *. / 
 /는 몫만
  --
  a: 1
  op: +
  b: 2
  1 + 2 = 3
  계속할까요(y/n)? y 
  a: 2
  op: *
  b: 2
  2 * 2 = 4
    계속할까요(y/n)? n
  끝.
  */
