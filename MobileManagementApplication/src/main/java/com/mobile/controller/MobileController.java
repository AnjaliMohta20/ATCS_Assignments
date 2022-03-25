package com.mobile.controller;

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

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@RestController
@RequestMapping("/Mobile")
public class MobileController {
	@Autowired
	MobileService service;
	@PostMapping("/addmobile")            //http://localhost:1890/Mobile/addmobile
	public Mobile addmobile(@RequestBody Mobile mobile)
	{
		return service.addmobile(mobile);
	}

	
	
	@PutMapping("/updatemobile")        //http://localhost:1890/Mobile/updatemobile
	public Mobile updatemobile(@RequestBody Mobile mobile)
	{
		return service.updatemobile(mobile);
	}
	
	
	
	@DeleteMapping("/deletemobile/{mobileId}")    //http://localhost:1890/Mobile/deletemobile/mobileId
	public void deletemobile(@PathVariable("mobileId") int mobileId)
	{
	     service.deletemobile(mobileId);
	}
	
	@GetMapping("/getmobile/{mobileId}")          //http://localhost:1890/Mobile/getmobile/mobileId
	public Optional<Mobile> getmobile( @PathVariable("mobileId") int mobileId) {
	  return service.getmobile(mobileId);
		
	}
	
	
	@GetMapping("/getAllmobiles")                     //http://localhost:1890/Mobile/getAllmobiles
	public Iterable<Mobile> getAllmobiles(@RequestBody Mobile mobile) {
		return service.getAllmobiles();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
