package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;

		System.out.print("이름: " ); 
		name = sc.nextLine();
		System.out.print("나이: "); 
		age = sc.nextInt(); // 수동장치 
		regDate = LocalDate.now();
		
		User user = new User();	
		user.setName(name); 
		user.setAge(age); 
		user.setRegDate(regDate);

		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				 user.getName(), user.getAge(), user.getRegDate()); 
	}
}

/*
사용자를 생성하라
사용자 이름 나이, UI 수동압력를 통해 입력받는다
가입일은 오늘 날짜 자동입력
--

이름: gambit
나이: 25

이름: gambit
나이: 25

가입일: 2021-11-10
*/