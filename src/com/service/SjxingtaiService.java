package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjxingtaiService {
	@Autowired
	private SjxingtaiDao sjxingtaiDao;

	public List querySjxingtais(Sjxingtai record,int page,int rows) {

		return sjxingtaiDao.getSjxingtaiList(record,page,rows);
	}

	public Sjxingtai getSjxingtai(int parseInt) {

		return sjxingtaiDao.getSjxingtaiById(parseInt);
	}

	public void modifySjxingtai(Sjxingtai sjxingtai) {

		sjxingtaiDao.update(sjxingtai);
	}

	public void deleteSjxingtai(Integer id) {

		sjxingtaiDao.delete(id);

	}

	public void save(Sjxingtai sjxingtai) {

		sjxingtaiDao.add(sjxingtai);

	}

}
