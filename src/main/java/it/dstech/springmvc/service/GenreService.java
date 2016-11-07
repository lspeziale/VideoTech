package it.dstech.springmvc.service;

import java.util.List;
import it.dstech.springmvc.model.Genre;

public interface GenreService {

	Genre findById(int genreId);

	void saveGenre(Genre genre);

	void deleteGenreById(Genre genreId);

	List<Genre> findAllGenres();

}
