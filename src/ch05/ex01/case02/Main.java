package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String name= "최한석";
		int age = 35;
		System.out.printf("%s은 %d살입니다.\n", name, age);
		
		User user = new User();
		user.name = "최한석";
		user.age = 35;
		System.out.printf("%s은 %d살입니다.\n", user.name, user.age); // 최항석의 속성 다른 속성을 넣으면 최한석 객체는 거짓이 됨
		 // System.out.printf("%s, %d\n", user.name, user.age); user. 없을때  0, null 쓰레기값아니고 없음
		User user2 = new User();
		user2.name = "최한석";
		user2.age = 35;
		System.out.printf("%s은 %d살입니다.\n", user2.name, user2.age);
	}
}
