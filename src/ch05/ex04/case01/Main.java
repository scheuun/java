package ch05.ex04.case01;

public class Main { 
	public static void main(String[] args) { // 객체 지향 벗어남
		Card.width = 10; // class card1은 객체
		Card.height = 20;
		
		//Card.kind 존재하지 않아 생성불가
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart"; // 객체.인스턴스변수 kind는 new로 생성
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s, %s\n", card1.kind, card2.kind);
		
		System.out.printf("%d, %d\n", Card.width, Card.height); // static시 클래스.변수
		System.out.printf("%d, %d\n", card1.width, card1.height); // 노란줄 컴파일불안 instance 객체.변수
		System.out.printf("%d, %d\n", card2.width, card2.height);
		
		card1.width = 100; // 1만 바꿔도 2까지 바뀜
		System.out.printf("%d, %d\n", card1.width, card2.width);
	}	
}



/* 버추얼머신 실행순서
 1.Main 틀래스 bytecode 읽어들임 
 2. Main 메소드 call 
 3.Card 클래스의 bytecode로딩 -> 메소드에어리어에 Main, Card bytecode스택
 4.static변수 생성
 */