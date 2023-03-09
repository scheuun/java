package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static { //  bytecode 로딩시 1번 실행 초기화 블럭 집합이름이 없음
		Init.s = 1;
		// this.i = 1; new 실행 안됨
		System.out.println("static{}");
	}
	
	{ // 인스턴스 초기화 블럭 new 할때마다 실행
		Init.s = 1;
		this.i = 1; // new로 객체 생성될 때 객체스콥내에서 1번 실행
		System.out.println("{}");
	}
	
	public Init() { // 호출시 생성자 먼저 실행하고 객체스콥내에서 1번 실행
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	
	public Init(int i) {
		Init.s = i;
		this.i = i;
		System.out.println("Init(int)");
	}
}
