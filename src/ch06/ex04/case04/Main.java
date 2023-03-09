package ch06.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Shoes shoes = new Shoes(10_000);
		
		System.out.println(shoes.getPrice()); // 20_000과 10_000들어있음 shoes부분에 get없어
	}
}
