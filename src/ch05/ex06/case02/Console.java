package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc; // 바이트코드 로딩될때 sc 블럭안 출력 
	
	static {
		sc = new Scanner(System.in);
	} // 스태틱 초기화 블럭 한번 실행
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim(); 
	} // trim 스페이스 문자 제거 인스턴스의 경우 this / class.
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num =  sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	public static void info(String msg) { // 포장
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
