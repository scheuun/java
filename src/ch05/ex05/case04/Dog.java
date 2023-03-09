package ch05.ex05.case04;

public class Dog {
	private String name;
	private String breed;
	
	public void eat() {} // eat 리턴값 관심없음 void {}
	public void shout() {} // 메소드는 공개 클래스 다음 {} null 값
	
	public void setName(String name) { // 쓰기만
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
