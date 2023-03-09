package ch07.ex02.service;

import ch07.ex02.domain.User;

public interface UserService { //DAO인터페이스 만든 이유는 service가 dao를 dependency로 쓰기 때문
	public User getUser();
}

// presentation has a service Dao select 시작 service 데이터 읽기 get