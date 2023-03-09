package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start."); // main이 current 호출 
		
		Thread counter = new Thread(new Counter()); // runnable 타입의 객체
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { // 주어가 run이 진행중이면 true 끝나면 false
			if(tries <= 2) {
				counter.join(1000); // 1초 메인과 카운터 관계 맺
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); // 깨어남
				counter.join(); // 기다림
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
