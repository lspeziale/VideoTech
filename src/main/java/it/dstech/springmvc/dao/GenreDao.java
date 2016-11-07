package it.dstech.springmvc.dao;

import java.util.List;

import it.dstech.springmvc.model.Genre;

public interface GenreDao {

	Genre findById(int genreId);

	void save(Genre genre);

	void deleteById(Genre genreId);

	List<Genre> findAllGenres();

}
