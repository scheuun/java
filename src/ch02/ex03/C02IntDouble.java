package ch02.ex03;

public class C02IntDouble {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int)d; //i는 casting연산자가 리턴한 값
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d);//floor 실수값 내림처리 데이터타입 다름
		double r = Math.round(d);//올림
		
		System.out.printf("%f, %f", f, r);
	}
}
