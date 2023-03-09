package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); //  객체 만들고 생성자 호출 후 생성자 블럭 실행 
		baby.setName("초롱이");
		
		baby = new Baby("튼튼이"); // 바로 초기화
	}
}
