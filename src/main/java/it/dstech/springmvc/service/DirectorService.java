package it.dstech.springmvc.service;

import java.util.List;

import it.dstech.springmvc.model.Director;

public interface DirectorService {

	Director findById(int directorId);

	void saveDirector(Director director);

	void deleteDirectorById(Director directorId);

	List<Director> findAllDirectors();

}
