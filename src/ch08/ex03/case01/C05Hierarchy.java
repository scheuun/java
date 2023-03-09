package ch08.ex03.case01;

public class C05Hierarchy {
	public void first() {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) { // 자식에서 부모 순 현장에서는 Arith 생략
			System.err.println("ArithmeticException 발생.");
		} catch(Exception e) {
			System.err.println("Exception 발생.");
		} // catch(ArithmeticException e) {}
	}
	
	public static void main(String[] args) {
		C05Hierarchy h = new C05Hierarchy();
		h.first();
	}
}
