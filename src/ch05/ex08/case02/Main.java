package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user = new User("최한석", 25, LocalDate.now()); // 생성자 데이터를 통해 new 객체 생성
		
		/*User user2 = new User(); // null 0 null
		user2.setName("양승일");
		user2.setAge(25);
		user2.setRegDate(LocalDate.now());*/
	}
}
