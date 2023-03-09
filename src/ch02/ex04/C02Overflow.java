package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; byte에 담을 수 없음 byte는 127까지
		byte b = 127;
		//b = b + 1;
		
		b++; // 1씩 증가
		b++;
		
		System.out.println(b); // 값 변질 
	}
}
