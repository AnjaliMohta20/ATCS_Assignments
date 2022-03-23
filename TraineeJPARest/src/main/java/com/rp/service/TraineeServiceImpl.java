package com.rp.service;

import java.util.List;

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
		
		return dao.addTrainee(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		
		return dao.updateTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int tid) {
		
		return dao.deleteTrainee(tid);
	}

	@Override
	public Trainee getTrainee(int tid) {
	
		return dao.getTrainee(tid);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		
		return dao.getAllTrainee();
	}

}
