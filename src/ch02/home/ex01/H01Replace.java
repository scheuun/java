package ch02.home.ex01;

import java.util.Scanner;

public class H01Replace {//2개 변수 바꾸기
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int temp = 0;//
		temp = a;//temp에 백업 해놓음
		a = b;
		b = temp;
	
		System.out.printf("%d, %d\n", a , b);		
	}
}
