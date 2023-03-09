package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1); // && and
		b = 2 < 1 && 2 > 1;		
		b = 2 < 1 || 2 > 1; // 둘중 하나 True
		b = 2 < 1 || 2 < 1;
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // x가 false이기 때문 결과치가 정해지면 계산 멈춤 그래서 y = 0
								// 부호 두개는 앞에 하나만 계산 y = 0
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y > 0; // x가 true이기 땨문에 y계산 안함
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y > 0;
		
		System.out.printf("x: %d y: %d b: %b", x, y, b);	
	}
}
