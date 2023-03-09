package ch04.ex01;

public class C02If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if (visitCnt < 1) { // 블럭 하나시 블럭 생략가능 배타적
			System.out.println("첫방문입니다.");
			visitCnt++;
		} else {
			System.out.println("재방문입니다."); // else 건너뜀
		}
		
		if(visitCnt < 1) System.out.println("첫방문입니다."); // visitCnt1이 됨
		else System.out.println("재방문입니다.");
	}
}
