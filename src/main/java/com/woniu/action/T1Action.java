package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.T1;
import com.woniu.service.IT1Service;
@Controller
public class T1Action {
	@Autowired
	private IT1Service t1s;
	private T1 t1;
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	public String save() {
		t1s.save(t1);
		return "success";
	}
}
