package it.dstech.springmvc.dao;

import java.util.List;

import it.dstech.springmvc.model.Movie;


public interface MovieDao {
	Movie findById(int movieId);

	void save(Movie movie);

	void deleteByTitle(String title);

	List<Movie> findAllMovies();
	
	Movie findByTitle(String title);

}
