package ch05.ex01.case04;

public class Main {
	public static void main(String[] args) { 
		User user = new User();	
		user.setName("최한석"); // setter를 통해서 
		user.setName("한아름"); // 유저 데이터 오염
		
		System.out.println(user.getName());
	}
} 
