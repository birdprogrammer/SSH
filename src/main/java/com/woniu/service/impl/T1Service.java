package com.woniu.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IT1DAO;
import com.woniu.pojo.T1;
import com.woniu.service.IT1Service;
@Service
@Transactional
public class T1Service implements IT1Service {
	@Autowired
	IT1DAO t1DAO;
	@Override
	public void save(T1 obj) {
		// TODO Auto-generated method stub
		t1DAO.save(obj);
	}

}
