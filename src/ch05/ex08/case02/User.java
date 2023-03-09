package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
/*
	public User() {} // 정보기입을 해야 User가 된 컴파일러가 기본 생성자를 추가시키는 경우는 클래스내에 어떤 생성자도 기술하지 않을 때이다.
	*/
	public User(String name, int age, LocalDate regDate) {
		this.name = name;  // 객체 생성 후에 생성자 실행 this객체 멤버변수에 값을 넣음
		this.age = age;
		this.regDate = regDate;
	}

	public void setName(String name) { // 멤버변수 만큼 세터 호출 생성자는 한번에
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	} // 생성자 1개
}
