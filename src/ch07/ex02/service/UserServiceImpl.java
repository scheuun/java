package ch07.ex02.service;

import ch07.ex02.domain.User;
import ch07.ex02.persistence.UserDao;

public class UserServiceImpl implements UserService { //확장성으로 새로운 클래스 만들어 교체
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
