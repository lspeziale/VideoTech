package it.dstech.springmvc.service;

import java.util.List;

import it.dstech.springmvc.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByRole(String role);

	List<UserProfile> findAll();

}
