package ch07.ex06.case06;

public class Cabinet<T extends A> { // T는 A이하
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) { // 리턴타입 S
		return arr[arr.length - 1];
	}
}
