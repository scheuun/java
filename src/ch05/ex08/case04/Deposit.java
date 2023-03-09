package ch05.ex08.case04;

public class Deposit {
	private int balance; // 잔액 0

	public Deposit() {
		this(1000); // 만들어진 생성자 호출
	}
	
	public Deposit(int principal) {
		this.balance = principal;
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest;
	}

	public int getBalance() {
		return balance;
	}
}
