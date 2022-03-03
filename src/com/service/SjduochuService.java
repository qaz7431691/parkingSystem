package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjduochuService {
	@Autowired
	private SjduochuDao sjduochuDao;

	public List querySjduochus(Sjduochu record,int page,int rows, String sdate, String edate, String sdate1, String edate1) {

		return sjduochuDao.getSjduochuList(record,page,rows,sdate,edate,sdate1,edate1);
	}

	public Sjduochu getSjduochu(int parseInt) {

		return sjduochuDao.getSjduochuById(parseInt);
	}

	public void modifySjduochu(Sjduochu sjduochu) {

		sjduochuDao.update(sjduochu);
	}

	public void deleteSjduochu(Integer id) {

		sjduochuDao.delete(id);

	}

	public void save(Sjduochu sjduochu) {

		sjduochuDao.add(sjduochu);

	}

}
