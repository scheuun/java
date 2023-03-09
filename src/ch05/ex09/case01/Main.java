package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init(); // 스태틱 블럭 /new 객체 생성후 인스턴스 블럭 {}/ 호출후 생성자 
		new Init(); // new 이후 인스턴스 블럭 / 첫번째 생성자
		
		new Init(1); // 두번째 생성자만 실행
	}
}
