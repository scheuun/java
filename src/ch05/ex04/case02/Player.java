package ch05.ex04.case02;

public class Player {
	public String name;
	public static String teamName; // 팀명 공유
	
	public String getName() {
		return name;
	}
	
	public static String getTeamName() {
		return teamName;
	}
	
	public void setName(String name) { // setName(String)만 컴파일러가 봄 String 타입만 받음 int 암받음
		this.name = name;
	}
	
	public static void setTeamName(String teamName) {
		Player.teamName = teamName;
	}
}
