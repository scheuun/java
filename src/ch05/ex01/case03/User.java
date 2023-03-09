package ch05.ex01.case03;

public class User { // encapsulation
	private String name; //private 접근제한자 캡슐화 외부에서 안보이고 내부에서 보임
	private int age;	 // public class private member변수
	// 메소드는 동작 이므로 동사로 이름붙임
	public void setname(String name) { // 리턴값이 없으면 void 이름 생성 name하나의 변수 setter 쓴다. 들락
		this.name = name; // member method
	}
	
	public void setAge(int age) { 
		this.age = age;		
	}
	
	public String getName() { // getter 읽는다. 날락
		return this.name;
	}
	
	public int getAge( ) {
		return this.age;
	}
}
