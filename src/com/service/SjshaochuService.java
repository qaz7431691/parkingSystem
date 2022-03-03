package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjshaochuService {
	@Autowired
	private SjshaochuDao sjshaochuDao;

	public List querySjshaochus(Sjshaochu record,int page,int rows, String sdate, String edate, String sdate1, String edate1) {

		return sjshaochuDao.getSjshaochuList(record,page,rows,sdate,edate,sdate1,edate1);
	}

	public Sjshaochu getSjshaochu(int parseInt) {

		return sjshaochuDao.getSjshaochuById(parseInt);
	}

	public void modifySjshaochu(Sjshaochu sjshaochu) {

		sjshaochuDao.update(sjshaochu);
	}

	public void deleteSjshaochu(Integer id) {

		sjshaochuDao.delete(id);

	}

	public void save(Sjshaochu sjshaochu) {

		sjshaochuDao.add(sjshaochu);

	}

}
