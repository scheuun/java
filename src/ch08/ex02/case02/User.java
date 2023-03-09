package ch08.ex02.case02;

public class User {
	private String name;
	private Level level;
	
	public User(String name, Level level) {
		this.name = name;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		
		if(nextLevel == null)
			throw new IllegalStateException(
					"이미 최고 등급" + this.level + "입니다."); // 거짓데이터에러 State는 Data
		else this.level = nextLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", name, level);
	}
}
