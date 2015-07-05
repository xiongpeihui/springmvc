package com.xph.smvc.service;

import java.util.List;

import com.xph.smvc.entity.User;

public interface UserService {
	public void deleteUser(User u);

	public void updateUser(User u);

	public User findUserById(Integer id);

	public List<User> findAllUser();
	public void saveUser(User u);
}
