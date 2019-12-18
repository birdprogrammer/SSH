package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.T1;

public interface IT1DAO {
	void save(T1 obj);
	List<T1> findAll();
}
