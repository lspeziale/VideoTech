package it.dstech.springmvc.service;

import java.util.List;

import it.dstech.springmvc.model.Actor;

public interface ActorService {

	Actor findById(int actorId);

	void saveActor(Actor actor);

	void deleteActorById(Actor actorId);

	List<Actor> findAllActors();

}
