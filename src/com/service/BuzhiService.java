package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class BuzhiService {
	@Autowired
	private BuzhiDao buzhiDao;

	public List queryBuzhis(Buzhi record,int page,int rows) {

		return buzhiDao.getBuzhiList(record,page,rows);
	}

	public Buzhi getBuzhi(int parseInt) {

		return buzhiDao.getBuzhiById(parseInt);
	}

	public void modifyBuzhi(Buzhi buzhi) {

		buzhiDao.update(buzhi);
	}

	public void deleteBuzhi(Integer id) {

		buzhiDao.delete(id);

	}

	public void save(Buzhi buzhi) {

		buzhiDao.add(buzhi);

	}

}
