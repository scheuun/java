package ch07.ex05.case02;

public class AutoBoxing { // 자동 promotion / Boxing 객체 만들기
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1); // 숫자1을 Integer객체로 Boxing
		int a3 = new Integer(1); // AutoUnboxing 1이 펼쳐져 a3에 담김
		Integer a4 = 1; // AutoBoxing Boxing 코드 없지만 자동으로 됨
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true);
		Boolean b4 = true;
	}
}
