package it.dstech.springmvc.dao;

import java.util.List;

import it.dstech.springmvc.model.User;

public interface UserDao {

	User findById(int userId);

	User findByUsername(String username);

	void save(User user);

	void deleteByUsername(String username);

	List<User> findAllUsers();

}
