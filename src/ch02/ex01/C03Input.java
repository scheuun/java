package ch02.ex01;

import java.util.Scanner;//외부에 있는 클래스를 소스에 포함시킬때 

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//sc값이 들어가 입력장치역할
		
		/*System.out.print("문자열을 입력하세요.\n> ");
		String s = sc.nextLine();
		System.out.println(s+ "를 입력했습니다.");
		*/
		
		/*System.out.print("숫자를 입력하세요.\n> ");
		int i = sc.nextInt();//1입력후 엔터가 \n이 되어 쓰레기가 됨
		System.out.println(i + "를 입력했습니다.");*/
		/*
		System.out.print("숫자를 입력하세요.\n> ");
		int i = sc.nextInt(); sc.nextLine(); nextLine을 추가하여 쓰레기 정리
		System.out.println(i + "를 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n> ");
		String s = sc.nextLine();//\n을 읽음
		System.out.println(s + "를 입력했습니다.");
		*/
		
		System.out.print("문자열을 입력하세요.\n> ");
		char c = sc.nextLine().charAt(0);//chaining 메소드를 연속으로 사용연속 0번째char 리턴
		System.out.println(c + "를 입력했습니다.");
	}
}
