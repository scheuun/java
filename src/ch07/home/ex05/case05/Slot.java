package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;
	
	public Slot() {	
		balls = new ArrayList<>();
		
		for(int i = 0; i <= 45; i++)
			balls.add(new Ball(i));
	}
	
	public Ball chuck() { // 토해낸다.
		int i = (int)(Math.random() * balls.size());
		return balls.remove(i); // i번째 ball 사라지고 우리 입장에선 나타남
	}
}
