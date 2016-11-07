package it.dstech.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;

import org.hibernate.criterion.Restrictions;

import it.dstech.springmvc.model.Director;

public class DirectorDaoImpl extends AbstractDao<Integer, Director> implements DirectorDao {

	@Override
	public Director findById(int directorId) {
		Director director = getByKey(directorId);
		if (director != null) {
			Hibernate.initialize(director.getDirectorId());
		}
		return director;
	}

	@Override
	public void save(Director director) {
		persist(director);

	}

	@Override
	public void deleteById(Director directorId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("directorId", directorId));
		Director director = (Director) crit.uniqueResult();
		delete(director);

	}

	@Override
	public List<Director> findAllDirectors() {
		Criteria criteria = createEntityCriteria();// To avoid
													// duplicates.
		@SuppressWarnings("unchecked")
		List<Director> directors = (List<Director>) criteria.list();

		// No need to fetch userProfiles since we are not showing them on list
		// page. Let them lazy load.
		// Uncomment below lines for eagerly fetching of userProfiles if you
		// want.

		for (Director director : directors) {
			Hibernate.initialize(director.getDirectorId());
		}

		return directors;
	}

}
