package it.dstech.springmvc.service;

import java.util.List;

import it.dstech.springmvc.model.User;

public interface UserService {

	User findById(int userId);

	User findByUsername(String username);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserByUsername(String username);

	List<User> findAllUsers();

	boolean isUsernameUnique(Integer userId, String username);

}