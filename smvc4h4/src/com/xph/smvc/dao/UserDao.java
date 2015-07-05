package com.xph.smvc.dao;

import java.util.List;

import com.xph.smvc.entity.User;

public interface UserDao {
	public void saveUser(User u);

	public void deleteUser(User u);

	public void updateUser(User u);

	public User findUserById(Integer id);

public List<User> findAllUser();
}
