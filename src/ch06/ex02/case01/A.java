package ch06.ex02.case01;

public class A {
	private int a; // 객체를 구성하는 요소 멤버변수
	int b; // default
	protected int c; // 상속을 기본으로 하는 접근제한자(외부)
	public int d; // 클래스 멤버변수 멤버메소드에 접근제한자 붙임
	
	private void m1() {} // 멤버 메소드
	void m2() {}
	protected void m3() {}
	public void m4() {}
}
