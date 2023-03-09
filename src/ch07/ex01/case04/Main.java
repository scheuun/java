package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus(); // tree 타입 casting
		platanus = (Platanus)tree;
		
		tree = platanus; // 부모타입 클래스로 promotion
		tree = (Tree)platanus; 
	}
}
