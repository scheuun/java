package ch05.ex03.case01;

public class Tv {
	private String color; // 멤버변수
	private boolean power;
	private int channel;
	
	public String getColor() {
		return color;
	}
	
	public boolean isPower() { // boolean 시작은 is
		return power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
}