package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0; // B객체 실행시 실행
		//x = a.a; private
		x = a.b; // default 동일한 패키지내 접근 가능
		x = a.c; // 동일한 패키지내 보임 자식관계는 접근 가능
		x = a.d;
		
		//a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
