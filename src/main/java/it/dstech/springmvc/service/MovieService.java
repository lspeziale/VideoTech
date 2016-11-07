package it.dstech.springmvc.service;

import java.util.List;
import it.dstech.springmvc.model.Movie;

public interface MovieService {

	Movie findById(int movieId);

	void saveMovie(Movie movie);

	void deleteByTitle(String title);

	List<Movie> findAllMovie();

}
