package ch05.home.ex05.case06;

public class Person {
	private String name;
	private Phone phone;
	
	public void sendMsg() {
		phone.sendMsg();
	}
	
	public void call() {
		phone.call();
	}
	
	public void playgame() {
		phone.playgame();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
