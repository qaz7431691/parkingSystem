package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class GgtypeService {
	@Autowired
	private GgtypeDao ggtypeDao;

	public List queryGgtypes(Ggtype record,int page,int rows) {

		return ggtypeDao.getGgtypeList(record,page,rows);
	}

	public Ggtype getGgtype(int parseInt) {

		return ggtypeDao.getGgtypeById(parseInt);
	}

	public void modifyGgtype(Ggtype ggtype) {

		ggtypeDao.update(ggtype);
	}

	public void deleteGgtype(Integer id) {

		ggtypeDao.delete(id);

	}

	public void save(Ggtype ggtype) {

		ggtypeDao.add(ggtype);

	}

}
