package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello"); // human안에 메소드 저장
		human.say(); // 콜
	}
}
