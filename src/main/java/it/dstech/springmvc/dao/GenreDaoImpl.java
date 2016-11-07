package it.dstech.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;

import org.hibernate.criterion.Restrictions;
import it.dstech.springmvc.model.Genre;

public class GenreDaoImpl extends AbstractDao<Integer, Genre> implements GenreDao {

	@Override
	public Genre findById(int genreId) {
		Genre genre = getByKey(genreId);
		if (genre != null) {
			Hibernate.initialize(genre.getGenreId());
		}
		return genre;
	}

	@Override
	public void save(Genre genre) {
		persist(genre);

	}

	@Override
	public void deleteById(Genre genreId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("genreId", genreId));
		Genre genre = (Genre) crit.uniqueResult();
		delete(genre);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Genre> findAllGenres() {
		Criteria criteria = createEntityCriteria();// To avoid
													// duplicates.
		List<Genre> genres = (List<Genre>) criteria.list();

		// No need to fetch userProfiles since we are not showing them on list
		// page. Let them lazy load.
		// Uncomment below lines for eagerly fetching of userProfiles if you
		// want.

		for (Genre genre : genres) {
			Hibernate.initialize(genre.getGenre());
		}

		return genres;
	}

}
