package ch07.ex01.case10;

public class TeslaCar implements SelfCar { // 하드웨어
	private SelfCar os; // 의존 소프트웨어 나중에 심음
	
	@Override
	public void start() {
		os.start();
	}
	
	public void setOS(SelfCar selfCar) {
		this.os = selfCar;
	}
}
