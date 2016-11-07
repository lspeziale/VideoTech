package it.dstech.springmvc.dao;

import java.util.List;

import it.dstech.springmvc.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findByRole(String role);

	UserProfile findById(int id);
}
