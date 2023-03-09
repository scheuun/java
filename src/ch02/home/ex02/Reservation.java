package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연 일자를 입력하세요");
		System.out.print("년: "); year = sc.nextInt();
		System.out.print("월: "); month = sc.nextInt();
		System.out.print("일: "); day = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(year, month, day);
		
		System.out.println();
		System.out.println(showDate + " 공연을 예매했습니다.");
		System.out.println(showDate.minusDays(3) + " 까지 환불이 가능합니다.");
	}
}	
		
		
		/*System.out.print("공연일자를 입력하세요.\n");
		System.out.print("년: ");
		 int year = sc.nextInt();
		System.out.print("월: ");
		 int month = sc.nextInt();
		System.out.print("일: ");
		 int day = sc.nextInt();
		
		System.out.println();
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println(date + " 공연을 예약했습니다.");
		date = date.minusDays(3);
		System.out.println(date + " 까지 환불가능합니다.");*/
