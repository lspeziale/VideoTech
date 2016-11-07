package it.dstech.springmvc.dao;

import java.util.List;

import it.dstech.springmvc.model.Actor;

public interface ActorDao {

	Actor findById(int ActorId);

	void save(Actor actor);

	void deleteById(Actor actorId);

	List<Actor> findAllActors();

}
