package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) { // static Main Localdate.now 객체생성 안함
		 Man.say("I love java"); // 객체 관심없고 say에만 관심 절차지향
		 //Man.tell("");
		 
		 Man man = new Man();
		 man.tell("I LOVE JAVA");
		 man.say("Hello"); // static 쓸수 있지만 경고
	}
}
