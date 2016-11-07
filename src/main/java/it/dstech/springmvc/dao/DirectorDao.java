package it.dstech.springmvc.dao;

import java.util.List;

import it.dstech.springmvc.model.Director;

public interface DirectorDao {

	Director findById(int directorId);

	void save(Director director);

	void deleteById(Director directorId);

	List<Director> findAllDirectors();

}
