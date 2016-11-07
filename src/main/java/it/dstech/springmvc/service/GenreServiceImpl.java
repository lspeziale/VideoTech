package it.dstech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.dstech.springmvc.dao.GenreDao;
import it.dstech.springmvc.model.Genre;

@Service("genreService")
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreDao dao;

	@Override
	public Genre findById(int genreId) {
		return dao.findById(genreId);
	}

	@Override
	public void saveGenre(Genre genre) {
		dao.save(genre);

	}

	@Override
	public void deleteGenreById(Genre genreId) {
		dao.deleteById(genreId);

	}

	@Override
	public List<Genre> findAllGenres() {
		return dao.findAllGenres();
	}

}
