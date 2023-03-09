package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good.");//두 조건다 만족 
		
		char b = 'b';
		if('a' < b && b < 'c') System.out.println("good.");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) // 3이만들어지고 x에 할당되고 0하고 비교 true||false
			System.out.printf("x: %d, y: %d\n", x, y); //  빠른  or 라서 결과는 true 리턴하고 끝내 y는 초기값
			
		String s = "hE";
		if(s.equals("he") || s.equals("HE") || s.equals("He") || s.equals("hE"))
			System.out.println("he"); //if 는 ;안붙임
		
		s = "";
		if(s.equals("")) System.out.println("값이 없다."); // null은 무 "" s변수의 값이 없으면
		
		s = "hello";
		if(!s.equals("")) System.out.println("값이 있다."); // false -> true 하나여도 값이 없는게 아니면
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}
 
// he, HE, He hE->he