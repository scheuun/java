package ch06.ex03.case01;

public class Animal {
	private String name;
	
	//public Animal() {} //이름없음
	
	public Animal(String name) {
		this.name = name; // name 여기서 초기화
	}

	public String getName() {
		return this.name;
	}
}
