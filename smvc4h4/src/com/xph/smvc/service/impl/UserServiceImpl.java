package com.xph.smvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xph.smvc.dao.UserDao;
import com.xph.smvc.entity.User;
import com.xph.smvc.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private UserDao userDao;

	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		userDao.deleteUser(u);
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findUserById(id);
	}

	public void updateUser(User u) {
		// TODO Auto-generated method stub
		userDao.updateUser(u);
	}

	public void saveUser(User u) {
		// TODO Auto-generated method stub
		userDao.saveUser(u);
	}

}
