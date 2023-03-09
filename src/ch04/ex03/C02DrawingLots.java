package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) { // 1 ~ 100 뽑은 수가 3의 배수면 끝 반복 멈춤
		int random = 1;
		int pickCnt = 0;
		
		while(!(random % 3 == 0)) { // 3의 배수가 아니면
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
		}
		
		System.out.printf("%d회 뽑아서, %d를 찾았습니다.", pickCnt, random);
	}
}