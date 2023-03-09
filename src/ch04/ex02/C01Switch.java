package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon += "10,000원 "; // 3 == 3
		case 2: coupon += "5,000원 "; // 3 == 2 false 건너뜀
		case 1: coupon += "1,000원"; // 3 == 1 false 건너뜀
		} // switch시 기준값과 비교값의 데이터 타입이 같아야 한다. == 연산자를 쓴다. 
		//integer 중 long은 제외(byte, short, char, int)
		
		System.out.println(coupon);
	}
}
