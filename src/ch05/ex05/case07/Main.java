package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		System.out.println(retailer.sell(farmer.sell(1000)).getPrice()); //chaining
	}
}

// 사과 가격 2000원을 출력하라