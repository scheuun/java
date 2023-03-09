package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0; //앞에 세글자 줄였는데 모를땐 주석
		int eng = 0;
		int math = 0;
		int tot = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt(); //presentation logic
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C'; // ?이면 business logic

		System.out.printf("\n총점: %d \n평균: %.1f \n학점: %c", tot, avg, grade);
		/*
		System.out.print("국어: ");
		int korean = sc.nextInt();
		System.out.print("영어: ");
		int english = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		System.out.printf("\n총점: %d", korean + english + math);
		
		double average = korean + english + math;
		System.out.printf("\n평균: %.1f", average/3);
		
		char grade = average >=90 ? 'A' : (average >= 80 ? 'B' : 'C');
		System.out.printf("\n학점: %c", grade);	
	    */
	}
}

/*
	총점, 평균, 학점을 출력하라
국어, 영어, 수학 점수를 입력받는다.
평균은 소수점 이하 한자리만 표현 

90<= mean <= 100 :A
80<= mean <= 90 :B
	mean < 80 : C
	
	국어 : 95
	영어 : 100
	수학: 100
	
	총점 295
	평균: 98.3
	학점 : A
*/