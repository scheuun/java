package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
	int month = 0;
	String season = "";
	Scanner sc = new Scanner(System.in);
	
	System.out.print("월: ");
	month = sc.nextInt();
	
	if( 3 <= month && month <= 5) season = "봄";
	else if( 6 <= month && month <= 8) season = "여름";
	else if( 9 <= month && month <= 11) season = "가을";
	else if( month == 12 || month == 1 || month == 2) season = "겨울"; // ==equal 연산자
	else season = "존재하지 않는 월"; // 예외처리
	
	/*if( month == 3 || month == 4 || month == 5) season = "봄";
	else if( month == 6 || month == 7 || month == 8) season = "여름";
	else if( month == 9 || month == 10 || month == 11) season = "가을";
	else if( month == 12 || month == 1 || month == 2) season = "겨울";
	*/
	System.out.printf("%d월은 %s입니다.", month, season);
	}
}

//if refactoring 