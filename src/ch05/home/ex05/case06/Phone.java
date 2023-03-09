package ch05.home.ex05.case06;

public class Phone { // dependency
	private String makerName;
	private int price;
	
	public void sendMsg() {}
	public void call() {}
	public void playgame() {}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
