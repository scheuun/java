package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() { // lock
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public void print() {
		System.out.print(val + " ");
	}
}
