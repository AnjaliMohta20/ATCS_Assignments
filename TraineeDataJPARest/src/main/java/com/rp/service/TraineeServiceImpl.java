package com.rp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.dao.Traineedao;
import com.rp.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl  implements TraineeService{
	
	@Autowired
	Traineedao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.save(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return dao.save(trainee);
	}

	@Override
	public void deleteTrainee(int tid) {
		
		dao.deleteById(tid);
	}

	@Override
	public Optional<Trainee> getTrainee(int tid) {
	
		return dao.findById(tid);
	}

	@Override
	public Iterable<Trainee> getAllTrainee() {
		
		return dao.findAll();
	}

}
