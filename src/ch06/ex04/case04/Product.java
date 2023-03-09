package ch06.ex04.case04;

public class Product {
	private int price;
	
	public Product(int price) {
		this.price = price * 2;

	}
	
	public int getPrice() {
		return this.price; // this는 객체 product타입
	}
}