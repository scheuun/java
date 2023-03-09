package ch06.ex02.case01.sub;

import ch06.ex02.case01.A; // ch06.ex02.case01.* 어떤것이 와도 된다.
import java.lang.*; // 컴파일러가 자동추가 기본생성자 this

public class B {
	public void test() {
		//ch06.ex02.case01.A a = new ch06.ex02.case01.A(); // 먼저 A를 sub패키지에서 찾음
		A a = new A(); // import 
		
		int x = 0;
		//x = a.a;
		//x = a.b; 다른 패키지여서 안보임 
		//x = a.c; 
		x = a.d;
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();
	}
}
