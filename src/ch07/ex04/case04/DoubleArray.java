package ch07.ex04.case04;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90}, // scores[0][0]
				{20, 20, 20}, // [1]번째 레코드의 [2]번째 배열
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		System.out.println("번호 국어 영어 수학 합계 평균");
		System.out.println("-----------------------------"); 
		
		for(int i = 0; i < scores.length; i++) { // length 5
			int sum = 0;
			
			System.out.print(" " + (i + 1) + " ");
			
			for(int j = 0; j < scores[i].length; j++) {	
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[i].length);
		}
	}
}
