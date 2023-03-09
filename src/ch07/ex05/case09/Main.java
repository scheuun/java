package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		
		String msg = "";
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A "; // c객체는 A의 인스턴스이다.
		if(c instanceof Object) msg += "Object ";
		System.out.println(msg); // C B A Object 
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object ";
		System.out.println(msg); // B Object 
		
		// if(b instanceof F)
		// if(c instanceof F)
		
		F f = new F();
		msg = "";
		// if(f instanceof C)
		if(f instanceof A) msg += "A "; // 인터페이스 시 실행하나 false
		System.out.println(msg);
	}
}
