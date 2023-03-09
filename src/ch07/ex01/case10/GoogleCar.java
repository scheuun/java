package ch07.ex01.case10;

public class GoogleCar implements SelfCar {
	@Override
	public void start() {
		System.out.println("Google start."); // 몸체 없고 OS만 만듦
	}
}
