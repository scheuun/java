package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		/*
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");
		System.out.println();
		*/
		
		Thread thread1 = new Thread(()-> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() ->{ // new Thread가 스레드 노동자
			for(char c = 'a'; c <= 'z'; c++) // 노동
				System.out.print(c + " ");
		});
			
		thread1.start(); // time sharing 되어 동시에 진행되는 것 같은 효과
		thread2.start(); // 멀티스레드
		System.out.println("main end.");
	}
}
