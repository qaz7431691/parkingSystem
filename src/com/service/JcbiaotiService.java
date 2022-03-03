package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class JcbiaotiService {
	@Autowired
	private JcbiaotiDao jcbiaotiDao;

	public List queryJcbiaotis(Jcbiaoti record,int page,int rows) {

		return jcbiaotiDao.getJcbiaotiList(record,page,rows);
	}

	public Jcbiaoti getJcbiaoti(int parseInt) {

		return jcbiaotiDao.getJcbiaotiById(parseInt);
	}

	public void modifyJcbiaoti(Jcbiaoti jcbiaoti) {

		jcbiaotiDao.update(jcbiaoti);
	}

	public void deleteJcbiaoti(Integer id) {

		jcbiaotiDao.delete(id);

	}

	public void save(Jcbiaoti jcbiaoti) {

		jcbiaotiDao.add(jcbiaoti);

	}

}
