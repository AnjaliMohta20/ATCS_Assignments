package com.rp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rp.entity.Trainee;

@Repository
public class TraineedaoImpl implements Traineedao {

	@PersistenceContext
	EntityManager entity;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.getTid());
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {

		return entity.merge(trainee);
	}

	@Override
	public String deleteTrainee(int tid) {
		Trainee emp = entity.find(Trainee.class, tid);

		if (emp != null) {
			entity.remove(emp);
			return "trainee deleted";
		} else {
			return "no trainee found";
		}
	}

	@Override
	public Trainee getTrainee(int tid) {

		return entity.find(Trainee.class, tid);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		TypedQuery<Trainee> result = entity.createQuery("select e from Employee e", Trainee.class);
		return result.getResultList();
	}

}
