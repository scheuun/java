package ch05.ex01.case03;

public class Main { // main client user server
	public static void main(String[] args) { // main 이라는 이름을 가진 이야기  차이점은 객체를 만드는 것부터 시작
		/*
		User user = new User();		// 5장은 객체를 만드는 것부터 시작 객체가 없으면 안됨 - 객체지향
		user.name = "최한석"; // 데이터는 안바뀜 데이터 필요하면 추가
		user.age = 12;
		//user.name = "한아름"; 기술적으로는 바꿀 수 있음
		
		User user2 = new User();	
		user2.name = "한아름";
		user2.age = 22;
		*/
		
		User user = new User();	// user는 데이터를 표현 - domain, model, entity
		user.setname("최한석"); // setname 메인메소드 콜 최한석 복사 되어 main String name에 저장
		user.setAge(12); // age에 저장 주어.서술어
		
		// user.setname("한아름");
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge()); // 읽어냄
	}
} 
