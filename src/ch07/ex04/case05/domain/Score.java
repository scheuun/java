package ch07.ex04.case05.domain;

public class Score {
	private int korScore;
	private int engScore;
	private int mathScore;
	private int sum;
	private int avg; // 90~270 90 레코드 레코드 1를 데이터 1로 취급
	
	public Score(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public int getKorScore() { // 캡슐화
		return korScore;
	}
	
	public int getEngScore() {
		return engScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getAvg() {
		return avg;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return String.format("%5d %5d %5d %4d %4d",
				korScore, engScore, mathScore, sum, avg);
	}
}
