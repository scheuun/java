package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("x: ");
		double x = sc.nextDouble();
		
		double result =  x - x % 1 ;
		System.out.println(result);
		
	}
}
/* %연산자를 이용해서, 실수값을 내림처리하라.
(casting) 는 사용하지 않는다.
실수 값은 sc.nextDouble()로 입력받는다.


x: 3.1492
3.0
*/