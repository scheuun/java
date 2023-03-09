package ch07.ex02.persistence;

import ch07.ex02.domain.User;

public class UserDaoImpl implements UserDao { // 자식 클래스
	@Override
	public User selectUser() { // 멤버변수는 인터페이스가 더 나음
		return new User("최한석"); // Dao는 업무에 관심없음 service에서 선택 service has a Dao(peristance
	}
}
