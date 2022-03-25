package com.rp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.entity.Trainee;
import com.rp.service.TraineeService;

@RestController
@RequestMapping("/trainee")  //  http://localhost:8083/trainee/add
public class TraineeController {
	@Autowired
	TraineeService service;
	
	@PostMapping("/add")//  http://localhost:8083/trainee/add
	public Trainee addTrainee(@RequestBody Trainee temp) {
		
		return service.addTrainee(temp);
	}
	
	@PutMapping("/update")//  http://localhost:8083/trainee/update
	public Trainee updateTrainee(@RequestBody Trainee emp) {
		
		return service.updateTrainee(emp);
	}
	
	@GetMapping("/get/{tid}")//  http://localhost:8083/trainee/get/
	public Optional<com.rp.entity.Trainee> getTrainee(@PathVariable("tid") int tid) {
		
		return service.getTrainee(tid);
	}
	
	@GetMapping("/getall")//  http://localhost:8083/trainee/getall
	public Iterable<com.rp.entity.Trainee> Trainee() {
		
		return service.getAllTrainee();
	}
	
	@DeleteMapping("/delete/{tid}")//  http://localhost:8083/trainee/delete/
	public void deleteTrainee(@PathVariable("tid") int tid) {
		
		 service.deleteTrainee(tid);
	}

}
