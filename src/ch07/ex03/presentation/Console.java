package ch07.ex03.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in); // 생성자(콘솔객체)
	
	static void info(Object obj) { // object타입 다 받음
		System.out.println(obj);
	}
	
	static String inStr(String msg) {
		System.out.print(msg + "\n> ");
		return sc.nextLine().trim();
	}
}