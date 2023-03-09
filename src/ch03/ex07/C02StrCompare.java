package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a"; // s변수 a상수		
		b = s == "a"; //true
		
		s = new String("a"); // ""과 같음 new 와 "" 유형 다름
		System.out.println(s); // a
		b = s == "a"; // false
		
		b = s.equals("a"); //s 주어 a 목적어 String 타입 데이터 비교시에는 equals 메소드 s와 a 같으면 true
		
		System.out.println(b);		
	}
}
