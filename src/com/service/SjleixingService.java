package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjleixingService {
	@Autowired
	private SjleixingDao sjleixingDao;

	public List querySjleixings(Sjleixing record,int page,int rows) {

		return sjleixingDao.getSjleixingList(record,page,rows);
	}

	public Sjleixing getSjleixing(int parseInt) {

		return sjleixingDao.getSjleixingById(parseInt);
	}

	public void modifySjleixing(Sjleixing sjleixing) {

		sjleixingDao.update(sjleixing);
	}

	public void deleteSjleixing(Integer id) {

		sjleixingDao.delete(id);

	}

	public void save(Sjleixing sjleixing) {

		sjleixingDao.add(sjleixing);

	}

}
