package ch07.ex04.case05.test;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.GradeServiceImpl;

public class CalcScoreTest { // 테스트시
	public static void main(String[] args) {
		GradeServiceImpl service = new GradeServiceImpl();
		
		Score[] scores = new Score[5]; // fixture(테스트용 데이터) 성적표
		
		for(int i = 0; i < scores.length; i++) 
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);	
		
		for(Score score: scores) System.out.println(score);
		
		System.out.println();
		for(Score score: scores) System.out.println(score);
	}
}
