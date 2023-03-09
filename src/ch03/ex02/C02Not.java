package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false; // Flag variable
		power = !power;
		System.out.println(power);
		
		power = !power; // toggle 스위치
		System.out.println(power);
	}
}
