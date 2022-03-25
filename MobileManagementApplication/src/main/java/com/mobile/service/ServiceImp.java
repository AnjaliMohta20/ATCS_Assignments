package com.mobile.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;
@Service
@Transactional
public class ServiceImp implements MobileService{
	@Autowired 
	MobileDao dao;

	@Override
	public Mobile addmobile(Mobile mobile) {//add,upadate---->save in crud class
		return dao.save(mobile);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		return dao.save(mobile);
	}

	@Override
	public void deletemobile(int mobileId) {              //as the name suggests it is used to delete the mobile by thier id in crud class.
		dao.deleteById(mobileId);
	}

	@Override
	public Optional<Mobile> getmobile(int mobileId) {  //to get the detail of a mobile  we findbyid in crud class
		return dao.findById(mobileId);
	}

	@Override
	public Iterable<Mobile> getAllmobiles() {         //to get all the details of mobies we use findAll in crud class
		return dao.findAll();
	}

	
	
	
	
	
}
