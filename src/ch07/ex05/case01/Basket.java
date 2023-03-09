package ch07.ex05.case01;

public class Basket<E> { // generic 타입은 일반타입 아무거나 <>는 Basket내 genery 타입을 씀
	private E e; // 의미 없음 디자인 시점에 타입정하지 않지만 new 생성시 정해야 함
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
