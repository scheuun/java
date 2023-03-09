package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("문자: ");
		char c = sc.nextLine().charAt(0);
		System.out.printf("%c의 unicode는 %s입니다.", c, Integer.toString(c));*/
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		int unicode = (int)ch;
		System.out.printf("%c의 unicode는 %d입니다.", ch, unicode);
	}
}
