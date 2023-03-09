package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time(); // time은 객체 주소값 데이터 저장 로컬변수 main변수 안에 선언 데이터 타입 class
		time.hour = 12; // hour 멤버변수 데이터 타입 int literal데이터 저장
		time.minute = 35; //  = 데이터 쓰기 .연산자 데이터 읽기  변수에서 주소값 읽은다음 주소를 찾아가는 연산
		time.second = 30; // 팀.팀원 = 야구공;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		// Time 콩통점 밑에 차이점 부여 
		Time time2 = new Time(); // Time() 12byte time 4byte
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time); // hashcode 주소값 ch05~Time - fullname  Time - shortname
		System.out.println(time2); // 앞은 공통점 뒤는 차이점
	}
}
