package ch09.ex04;

public class Buffer {
	private Integer val; // 생산자 소비자
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); // object 상속
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		this.val = null;
		
		notifyAll(); // 모두에게 알림
		
		return val;
	}
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}	
		
		this.val = val;
		notifyAll();
	}
}

