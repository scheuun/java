package ch07.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3]; // 고양이 3마리 집에 담음
		
		cats[0] = new Cat("해롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코미");
		
		//cats[2] = new Dog();
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
