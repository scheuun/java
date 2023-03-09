package ch07.ex04.case03;

public class Slot {
	private Ball[] balls; // ball타입 주머니
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
	}
	
	public Ball chuck() { // 주어의 서술어 chuck
		int i = 0;
		Ball ball = null;
	
		do {
			i = (int)(Math.random() * 45); // 0 ~ 44 
			ball = balls[i];
			balls[i] = null;
		} while(ball == null);
		
		return ball;	
	}
}
