package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // decinmal 
		System.out.println(Integer.toBinaryString(x));//2진수 풀력
		
		x = 012; //octal 8진수 10 앞에 0뭍임
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; //16진수 10 앞에 0x붙임
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // 2진수 앞에 0b붙임
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; //1,000단위구문기호 _
		System.out.println(x + 1);//줕리기 연산자 더해지면 숫자 안더해지면 문자
		
		double y = 1e1;//10의 1제곰
		System.out.println(y);
		
	}

}
