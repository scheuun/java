package ch07.ex08.service;

import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.domain.Score;


public class GradeServiceImpl implements GradeService {
	private ScoreDao scoreDao;
	
	public GradeServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public List<Score> getScores() {
		List<Score> scores = (scoreDao.selectScores());
		this.calcScore(scores); 
		return scores;
	}
	
	public void calcScore(List<Score> scores) {
		for(int i = 0; i < scores.size(); i++) { // length 5
			scores.get(i).setSum(
					scores.get(i).getKorScore() + // 처음은 score[0]
					scores.get(i).getEngScore() + 
					scores.get(i).getMathScore());
			scores.get(i).setAvg(scores.get(i).getSum() / 3);
		}
	}
}
