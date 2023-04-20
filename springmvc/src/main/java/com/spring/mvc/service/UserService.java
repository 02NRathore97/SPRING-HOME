package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.mvc.dao.UserDao;
import com.spring.mvc.model.User;

@Service

public class UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void createUser(User user) {
		userDao.saveUser(user);
	}
}
