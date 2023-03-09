package ch06.ex04.case04;

public class Shoes extends Product { // 멤버변수 생성자 멤버메소드 순으로 작성
	private int price; // 멤버변수 오버라이드 안됨
	
	/*public Shoes() {
		super();
	}멤버변수 생성자 멤버메소드
	product에 기본 생성자가 없어 오류 super생성자는 기본 생성자를 불러옴
	컴파일 시 클래스에 생성자가 없어야만, 자동으로 기본 생성자를 추가*/

	public Shoes(int price) {
		super(price);
		this.price = price;
	}
	// 2차
	@Override
	public int getPrice() {
		return this.price; // this의 데이터 타입 shoes
	}
}
