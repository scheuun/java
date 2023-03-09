package ch06.ex03.case01;

public class Cat extends Animal { // name
	private int age;
	
	 public Cat(String name, int age) { // 생성자 (인스턴스 = 멤버변수) 초기화
		//super(); //  자식 클래스 첫줄에는 부모클래스 호출 파라미터 존재안함 public Animal() {}
		super(name); // 상속받은 이름
		 // this.name = name; this는 내 클래스내 super는 부모클래스내
		this.age = age;
	}
	 
	 public int getAge() {
		 return this.age;
	 }
}
