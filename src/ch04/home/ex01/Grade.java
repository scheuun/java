package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0; 
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) grade += "+";
			else if(score < 94) grade += "-";
		} else if(score >= 80) {
			grade = "B";
			if(score >= 88) grade += "+";
			else if(score < 84) grade += "-";
		} else {
			grade = "C";
		}
		
		System.out.println(grade);
	}
}
		

/*
점수를 입력받는다.
다음 구간별로 학점을 부여하라
98 이상 A+
94 A
90 A-
88 B+
84 B
80 B-
80 미만  C

점수 : 100
A+
*/