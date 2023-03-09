package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0; // 몸무게미만 60 줄넘기 멈춤 , 60초과 줄넘기 반복
		
		while(weight > 60) { // 반복의 횟수 모르고 조건을 알때 사용 business logic
			jumpCnt++; // 줄넘기 하다.
			weight--; // 줄넘기 1회당 1kg감소		
		}
		
		System.out.printf("줄넘기 %d번으로, 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
} 
