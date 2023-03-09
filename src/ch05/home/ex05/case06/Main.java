package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Person person = new Person();
		
		phone.setMakerName("삼성");
		phone.setPrice(1_000_000);
		
		person.setName("최한석");
		
		person.setPhone(phone);
		
		person.sendMsg();
		person.call();
		person.playgame();
	}
}

/*
최한석이 삼성폰을 1백만원 주고 샀습니다
손에 든 폰을 보니 흐뭇합니다

메세지를 보내봅니다
답장이없어 전화를 걸어보니 연결이 안되네요
잡시뒤에 다시 연략해보렵니다
기다리는 동안 폰으로 게임을 합니다
*/