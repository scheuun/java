package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2); // 주어(객체).서술어
		result = calculator.add(1, 2, 3);
		
		System.out.println(result);
	}
}
