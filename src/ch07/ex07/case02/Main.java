package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say."); // Human 안에 객체 안담김
		human.say(); // Human say.
		Human.walk(); // Human walk.
		// human.walk(); 스태틱 불가
		human.sleep(); // 디폴트 메소드 사용 가능 Human sleep.
		
		human = new Student();
		human.say(); // 오버라이드 메소드 실행 Student say.
		// human.walk();
		human.sleep(); // Human sleep.
	}
}
