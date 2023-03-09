package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a + b); // byte를  써도 +를 쓰는 순간 int로 바뀐다.
		System.out.println(c);
		
		//c = c + 1; //error
		c++; // 이항연산자가 아니여서 promotion 안됩
		System.out.println(c);
		
		double d = a / b; // a,b int 미만 1.5는 정수 가 아니기 때문
		System.out.println(d);
		
		//good 1.5로 에러 고치기
		d = (double)a / b;
		System.out.println(d);
		d = 1.0 * a / b; // double 3.0 만들어짐
		System.out.println(d);
		
		//bad
		d = (double)(a / b); // /먼저 계산됨
		System.out.println(d);
		d = a / b * 1.0; // 이미 1이 얻어짐
		System.out.println(d);
	}
}