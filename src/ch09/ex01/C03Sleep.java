package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
			try {					// main 스레드가 sleep 호출 1찍고 쉬고
				Thread.sleep(1000); // throws가 선언되어 콜할때 try{}으로 묶음
			} catch(Exception e) {}
		}
	}
}
