package ch05.ex06.case01;

public class Man {
	public static void say(String msg) { // 스태틱 메소드 서술어에 관심있을 때
		System.out.println(msg); // System 클래스의 out 인스턴스 멤버변수 
	}
	
	public void tell(String msg) { // 인스턴스 메소드
		System.out.println(msg);
	}
}
