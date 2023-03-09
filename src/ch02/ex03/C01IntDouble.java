package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;//Int Double 높게 변환 promotion i값 읽어서 cpu저장 변환
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i; //()casting/promotion 연산자
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;
		i = (int)d; //overflow 주의 casting
		System.out.printf("%f, %d", d, i);
	}

}
