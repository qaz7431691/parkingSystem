package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjpinglunService {
	@Autowired
	private SjpinglunDao sjpinglunDao;

	public List querySjpingluns(Sjpinglun record,int page,int rows, String sdate, String edate, String sdate1, String edate1) {

		return sjpinglunDao.getSjpinglunList(record,page,rows,sdate,edate,sdate1,edate1);
	}

	public Sjpinglun getSjpinglun(int parseInt) {

		return sjpinglunDao.getSjpinglunById(parseInt);
	}

	public void modifySjpinglun(Sjpinglun sjpinglun) {

		sjpinglunDao.update(sjpinglun);
	}

	public void deleteSjpinglun(Integer id) {

		sjpinglunDao.delete(id);

	}

	public void save(Sjpinglun sjpinglun) {

		sjpinglunDao.add(sjpinglun);

	}

}
