package it.dstech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.springmvc.dao.UserProfileDao;
import it.dstech.springmvc.model.UserProfile;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileDao dao;

	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	public UserProfile findByRole(String role) {
		return dao.findByRole(role);
	}

	public List<UserProfile> findAll() {
		return dao.findAll();
	}
}
