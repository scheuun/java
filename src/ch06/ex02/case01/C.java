package ch06.ex02.case01;

public class C extends A { // a,b,c,d,m1,m2,m3,m4 있음
	public void test() {
		int x = 0;
		
		// x = this.a; // 자식도 안보여줌
		x = this.b;
		x = this.c;
		x = this.d;
		
		//this.m1();
		this.m2();
		this.m3();
		this.m4();
	}
}
