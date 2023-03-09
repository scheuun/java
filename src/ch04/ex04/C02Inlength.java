package ch04.ex04;

import java.util.Scanner;

public class C02Inlength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("한 글자를 입력하세요.: ");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "글자 입력했습니다.");
			}while(len != 1); // 한번은 입력애야 찾을 수 있음
		
		System.out.println("끝.");
	}
}
