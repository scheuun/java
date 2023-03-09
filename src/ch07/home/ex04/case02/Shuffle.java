package ch07.home.ex04.case02;

public class Shuffle {
	public static void main(String[] args) {
		int[] cards = new int[5];
				
		for(int i = 0; i < cards.length; i++) cards[i] = i;
		
		for(int i: cards) System.out.print(i + " "); 
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			int temp = cards[0]; // 0번째와 교체
			cards[0] = cards[idx]; // 임의의 위치
			cards[idx] = temp;
		}
		
		for(int i: cards) System.out.print(i + " ");
	}
}

// 숫자 5개 섞