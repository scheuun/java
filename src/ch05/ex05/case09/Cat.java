package ch05.ex05.case09;

public class Cat {
	private String name;
	
	public Cat breed() { // 클래스내 클래스 또 쓸 수 있음
		return new Cat();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
