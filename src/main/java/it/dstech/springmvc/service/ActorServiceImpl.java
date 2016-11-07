package it.dstech.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.dstech.springmvc.dao.ActorDao;

import it.dstech.springmvc.model.Actor;

@Service("actorService")
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorDao dao;

	@Override
	public Actor findById(int actorId) {
		return dao.findById(actorId);

	}

	@Override
	public void saveActor(Actor actor) {
		dao.save(actor);

	}

	@Override
	public void deleteActorById(Actor actorId) {
		dao.deleteById(actorId);

	}

	@Override
	public List<Actor> findAllActors() {
		return dao.findAllActors();
	}

}
