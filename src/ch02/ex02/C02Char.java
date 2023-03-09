package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A';// 십진법65 0041을 십진수로 번역하면 65 ''상수 표현
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041';  // u 유니코드
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
	}

}
