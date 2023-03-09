package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		/*
		 int i = 0;
		  while(; i < 10;) { // 반복의 횟수 있고 ;;안 조건문
			System.out.print(i + " ");
			i++;
		}
		*/
		
		for(int i = 0; i < 10; i++) { // 반복의 횟수를 결정 짓고 ;;안 조건문 <10 10번 반복
			System.out.print(i + " "); // true가 나오면 블럭 실행 블럭마치면 3번째 조건문 실행 1.int 2.< 3.{} 4.++ 10미만까지 반복
		}	
		System.out.println();
		
		for(int i = 1; i <= 10; i++) { // 반복의 횟수를 결정 짓고 ;;안 조건문 <10 10번 반복
			System.out.print(i - 1 + " ");
		}
	}
}
