package com.rp.service;

import java.util.List;
import java.util.Optional;

import com.rp.entity.Trainee;

public interface TraineeService {

	Trainee addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	void deleteTrainee(int tid);

	Optional<Trainee> getTrainee(int tid);

	Iterable<Trainee> getAllTrainee();
}
