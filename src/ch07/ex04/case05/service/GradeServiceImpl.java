package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class GradeServiceImpl implements GradeService {
	private ScoreDao scoreDao;
	
	public GradeServiceImpl() {} // 테스트용
	
	public GradeServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) { // 5번 호출
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		Score[] scores = (scoreDao.selectScores());
		this.calcScore(scores); // scores service dao 공유
		return scores;
	}
	
	public void calcScore(Score[] scores) {
		//Score[] scores = scoreDao.selectScores();
		
		for(int i = 0; i < scores.length; i++) { // length 5
			scores[i].setSum(
					scores[i].getKorScore() + // 처음은 score[0]
					scores[i].getEngScore() + 
					scores[i].getMathScore());
			scores[i].setAvg(scores[i].getSum() / 3);
		}
	}
}
