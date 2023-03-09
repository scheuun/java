package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0; // 31이 된 후 3.1이 됨
		System.out.println(shortPi);
		
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		shortPi = (int)Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
	}
}
