package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class UxtypeService {
	@Autowired
	private UxtypeDao uxtypeDao;

	public List queryUxtypes(Uxtype record,int page,int rows) {

		return uxtypeDao.getUxtypeList(record,page,rows);
	}

	public Uxtype getUxtype(int parseInt) {

		return uxtypeDao.getUxtypeById(parseInt);
	}

	public void modifyUxtype(Uxtype uxtype) {

		uxtypeDao.update(uxtype);
	}

	public void deleteUxtype(Integer id) {

		uxtypeDao.delete(id);

	}

	public void save(Uxtype uxtype) {

		uxtypeDao.add(uxtype);

	}

}
