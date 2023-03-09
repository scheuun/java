package ch07.ex01.case08;

public class Main {
	public static void main(String[] args) {
		Clerk clerk = new Clerk(); // 확장성 있음
		
		System.out.println(clerk.sell("장미"));
	}
}
