package ch06.ex06.case09;

public class Console implements UI { // in 상속안됨
	@Override
	public void out() {
		System.out.println("println()으로 출력하다.");
	}
}
