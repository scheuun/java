package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("늠름이");
		
		Cat cat2 = new Cat();
		cat2.setName("튼튼이");
		
		System.out.printf("엄마: %s, 아기: %s", cat1.getName(), cat2.getName());
	}
}
