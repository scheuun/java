package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3;
		
		i = i + 2; //2씩 중가
		i += 2; //복합할당연산자
		i -= 2;
		i *= 2;
		i /= 2;
		i %= 2;
		
		System.out.println(i);
	}
}
