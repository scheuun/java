package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start."); // 현재 실행중인 스레드 이름
	
		for(char c = 'a'; c < 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end."); // 스레드가 할 일
	}
}
