package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.setName("최한석");
		player2.setName("한아름");
		player3.setName("양승일");
	
		player3.kick(player2.pass(player1.pass(ball)));
	}
}

/*
최한석, 한아름, 양승일이 축구를 한다
한석이가 아름이에게 패스
아름이는 승일이한테 패스
승일이는 공을 찬다.
*/