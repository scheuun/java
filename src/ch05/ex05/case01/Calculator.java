package ch05.ex05.case01;

public class Calculator { // 데이터는 감추고 메소드는 공개 저장할때는 멤버변수
	public int add(int a, int b) { // 같은 메소드명 add(int int) 중복으로  컴파일 에러
		return a + b;
	}
	
	public int add(int x, int y, int z) {
		return x + y + z;
	}
}
