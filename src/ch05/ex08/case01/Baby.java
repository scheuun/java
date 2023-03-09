package ch05.ex08.case01;

public class Baby {
	private String name;
	
	public Baby() {} // 기본 생성자 리턴타입 없음 클래스 네임 같음
	
	public Baby(String name) {
		this.name = name; // setter와 유사 멤버변수 초기화 태어날 때부터 이름 붙임
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
