package it.dstech.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import it.dstech.springmvc.model.Movie;
import it.dstech.springmvc.model.User;

@Repository("movieDao")
public class MovieDaoImpl extends AbstractDao<Integer, Movie> implements MovieDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	@Override
	public Movie findById(int movieId) {
		Movie movie = getByKey(movieId);
		return movie;
	}

	@Override
	public void save(Movie movie) {
		persist(movie);
		
	}

	@Override
	public void deleteByTitle(String title) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("title", title));
		Movie movie = (Movie) crit.uniqueResult();
		delete(movie);
		
	}

	@Override
	public List<Movie> findAllMovies() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("title"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid
																		// duplicates.
		@SuppressWarnings("unchecked")
		List<Movie> movieList = (List<Movie>) criteria.list();

		// No need to fetch userProfiles since we are not showing them on list
		// page. Let them lazy load.
		// Uncomment below lines for eagerly fetching of userProfiles if you
		// want.

		

		return movieList;
	}

	@Override
	public Movie findByTitle(String title) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("title", title));
		Movie movie = (Movie) crit.uniqueResult();
	
		return movie;
	}

	

}
