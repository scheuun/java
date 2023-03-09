package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c; //+더하기, 뭍이기 구분은 String으로
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; //String 땜시 sum은 문자 6 취급
		System.out.println(sumStr);
		
		String s = "" + a + b; //문자붙이기 문자 1, 2
		System.out.println(s);
		
		s = a + b + ""; // ""빈문자 스트링타입
		System.out.println(s);
		
		String dialog = "John said, \"hello\"."; //역슬 다음은 "도 특수문자 됨
		System.out.println(dialog);
	}
}
