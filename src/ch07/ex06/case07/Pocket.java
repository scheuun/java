package ch07.ex06.case07;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
		// new Number(1) + new Number(1); // int double의 부모 클래스
	}
	
	// unbounded wildcard
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	// upper bounded wildcard
	public double add(List<? extends Number> list) { // generic 클래스 사용 시점에 아무거나 표현
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		
		return sum;
	}	
	
	// lower bounded wildcard
	public List<? super Integer> add2(List<? super Integer> list) { // 메소드 중복 2
		return list;
	}
}
