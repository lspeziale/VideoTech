package it.dstech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import it.dstech.springmvc.dao.DirectorDao;
import it.dstech.springmvc.model.Director;

@Service("directorService")
public class DirectorServiceImpl implements DirectorService {
	
	@Autowired
	private DirectorDao dao;

	@Override
	public Director findById(int directorId) {
		return dao.findById(directorId);
	}

	@Override
	public void saveDirector(Director director) {
		dao.save(director);
		
	}

	@Override
	public void deleteDirectorById(Director directorId) {
		dao.deleteById(directorId);
		
	}

	@Override
	public List<Director> findAllDirectors() {
		return dao.findAllDirectors();
	}
	
	

}
