package com.rp.controller;

import java.util.List;

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
@RequestMapping("/trainee")//http://localhost:8081/employee/add
public class TraineeController {
	@Autowired
	TraineeService service;
	
	@PostMapping("/add")
	public Trainee addTrainee(@RequestBody Trainee temp) {
		
		return service.addTrainee(temp);
	}
	
	@PutMapping("/update")
	public Trainee updateTrainee(@RequestBody Trainee emp) {
		
		return service.updateTrainee(emp);
	}
	
	@GetMapping("/get/{tid}")
	public Trainee getTrainee(@PathVariable("tid") int tid) {
		
		return service.getTrainee(tid);
	}
	
	@GetMapping("/getall")
	public List<Trainee> Trainee() {
		
		return service.getAllTrainee();
	}
	
	@DeleteMapping("/delete/{tid}")
	public String deleteTrainee(@PathVariable("tid") int tid) {
		
		return service.deleteTrainee(tid);
	}

}
