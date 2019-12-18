package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IT1DAO;
import com.woniu.pojo.T1;
@Repository
public class T1DAOImpl implements IT1DAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(T1 obj) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(obj);
	}

	@Override
	public List<T1> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
