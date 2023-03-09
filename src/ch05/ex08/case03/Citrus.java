package ch05.ex08.case03;

public class Citrus { // 생산자
	private String name;
	
	public Citrus() { // 기본생성자
		//this.name = "천혜향"; // 천혜향 농장에서만 쓸 수 있어 확장성 떨어짐
		//new Citrus("천혜향"); // new로 생성자 호출 버그
		this("천혜향");
	}
	
	public Citrus(String name) { // this String(Citrus this, String name)
		this.name = name; // 확장성이 더 좋다.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
