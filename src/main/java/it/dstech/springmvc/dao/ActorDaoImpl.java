package it.dstech.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import it.dstech.springmvc.model.Actor;

@Repository("actorDao")
public class ActorDaoImpl extends AbstractDao<Integer, Actor> implements ActorDao {

	@Override
	public Actor findById(int actorId) {
		Actor actor = getByKey(actorId);
		if (actor != null) {
			Hibernate.initialize(actor.getActorId());
		}
		return actor;
	}

	@Override
	public void save(Actor actor) {
		persist(actor);

	}

	@Override
	public List<Actor> findAllActors() {
		Criteria criteria = createEntityCriteria();// To avoid
													// duplicates.
		@SuppressWarnings("unchecked")
		List<Actor> actors = (List<Actor>) criteria.list();

		// No need to fetch userProfiles since we are not showing them on list
		// page. Let them lazy load.
		// Uncomment below lines for eagerly fetching of userProfiles if you
		// want.

		for (Actor actor : actors) {
			Hibernate.initialize(actor.getActorId());
		}

		return actors;
	}

	@Override
	public void deleteById(Actor actorId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("actorId", actorId));
		Actor actor = (Actor) crit.uniqueResult();
		delete(actor);

	}

}
