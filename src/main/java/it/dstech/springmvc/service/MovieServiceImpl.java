package it.dstech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.springmvc.dao.MovieDao;
import it.dstech.springmvc.model.Movie;

@Service("movieService")
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao dao;

	@Override
	public Movie findById(int movieId) {
		return dao.findById(movieId);
	}

	@Override
	public void saveMovie(Movie movie) {
		dao.save(movie);

	}

	@Override
	public void deleteByTitle(String title) {
		dao.deleteByTitle(title);

	}

	@Override
	public List<Movie> findAllMovie() {
		return dao.findAllMovies();
	}

}
