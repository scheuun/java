package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() { // 부모 이름 빌려씀 이름없는 클래스 블럭표시
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}
