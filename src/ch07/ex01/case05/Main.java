package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine(); // 소방차가 차로 프로모션 차고에 있음
		car.run();
		// car.water(); 객체.메소드 Car 클래스에 water 없음 
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run(); // 달릴때 캐스팅
	}
}
