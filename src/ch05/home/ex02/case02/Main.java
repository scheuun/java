package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // new실행 인스턴스 생김
		Paper paper = new Paper(); // 지역변수 실행 스택생김
		
		System.out.print("메세지: ");
		paper.setMsg(sc.nextLine()); // paper 지역변수
		System.out.print("작성자명: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s.", paper.getMsg(), paper.getWriterName()); 
	}
} // 메소드가 시작하면 끝내야함

/*
종이에 메세지와 작성자명을 기록한다
--

메세지: hello
작성자명: terry

hello from terry.
*/