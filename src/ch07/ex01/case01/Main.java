package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) { // 객체는 여러타입(예:사람, 여자, 학생) -다형성 한 순간 하나 객체
		C c = new C();
		B b = c; // c b타입 promotion B 변수 b 타입
		A a = c; // c a타입 바꾸는 이유 행동을 다르게 하기 위해 메소드를 다르게 쓰기 위해
		
		c = (C)a; // casting 연산자 C 타입으로 변환
		c = (C)b;
		
		b = (B)a; // 객체가 갖고 있는 타입으로 바뀜
		
		//String s = (String)c; 스트링 없어 못바꿈
	}
}
