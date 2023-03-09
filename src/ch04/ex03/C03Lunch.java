package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) { // 먹는 행동
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) { // 음식이 상했으면
				System.out.println("상한 음식을 뱉다.");
				break; // 독립적 문법 3이 나오면
			}
			
			calorie += food; // 3추가
		}
		
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}