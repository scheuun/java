package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*
		 int input = 0;
		 
		
		do {
			System.out.print("입력: ");
			input = sc.nextInt();
			} while(!(1 <= input && input <= 9));  // while 안은 반대값 !안 값도 반대값
			
			System.out.println("끝.");
		*/
		// 10이상의 자연수 예외처리
		String input = ""; 
		boolean isGood = false;
		String errMsg = "ERROR] 한자리 자연수 를 입력하세요.";
	
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
	
			if('0' < input.charAt(0) && input.charAt(0) <= '9'&& input.length() == 1) // 첫번째 거짓  HR
				isGood = true;
			else System.out.println(errMsg);
			} while(!isGood); 
		
		System.out.println("끝.");
	}
}
