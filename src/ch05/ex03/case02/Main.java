package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.printf("%s\n%s\n\n", tv1, tv2);
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv2 = tv1; // 주소값 2 사라짐  메소드는 쓰레기가 됨 언제 치워질지는 모름
		System.out.printf("%s\n%s", tv1.getColor(), tv2.getColor());
	}
}
