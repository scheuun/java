package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) { // 회원명을 입력하세요
		System.out.println(obj); // User 부분 to String
	}
}
