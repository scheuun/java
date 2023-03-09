package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;


public class C06Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();	//오능 날짜 출력용
		LocalTime time = LocalTime.now();   //시간
		
		System.out.println(date);
		System.out.println(time);
	}
}
