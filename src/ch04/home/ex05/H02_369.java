package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0; //십의 자리
		int ones = 0; //일의 자리
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("짝");
			if(ones != 0 && ones % 3 == 0) System.out.print("짝");
			
			if(i % 10 == 0) System.out.println();
		}
	}
}



/*
369 게임을 하라
숫자는 1이상 99이하
10단위로 새로운 줄에 출력

--


1 2 3짝 4 5 6짝 10
11 12 13짝 ... 20
..
99짝짝
*/