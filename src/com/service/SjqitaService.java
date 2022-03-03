package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjqitaService {
	@Autowired
	private SjqitaDao sjqitaDao;

	public List querySjqitas(Sjqita record,int page,int rows) {

		return sjqitaDao.getSjqitaList(record,page,rows);
	}

	public Sjqita getSjqita(int parseInt) {

		return sjqitaDao.getSjqitaById(parseInt);
	}

	public void modifySjqita(Sjqita sjqita) {

		sjqitaDao.update(sjqita);
	}

	public void deleteSjqita(Integer id) {

		sjqitaDao.delete(id);

	}

	public void save(Sjqita sjqita) {

		sjqitaDao.add(sjqita);

	}

}
