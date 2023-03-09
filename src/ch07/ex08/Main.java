package ch07.ex08;

import java.util.ArrayList;
import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.dao.ScoreDaoImpl;
import ch07.ex08.domain.Score;
import ch07.ex08.presentation.GradeIo;
import ch07.ex08.service.GradeService;
import ch07.ex08.service.GradeServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Score> scores = new ArrayList<>(); // 데이터의 개수를 미리 정해 놔 한계
		/*
		for(int i = 0; i < scores.length; i++) 
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10); // 초기화 작업
		 insert 로 직접 데이터 구현*/ 
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		GradeService gradeService = new GradeServiceImpl(scoreDao);
		GradeIo gradeIo = new GradeIo(gradeService);

		gradeIo.play();
	}
}
