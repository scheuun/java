package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String name; // 기본값 null 
	private int age;
	private LocalDate regDate;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
