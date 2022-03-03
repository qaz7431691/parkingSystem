package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class JcdaohangService {
	@Autowired
	private JcdaohangDao jcdaohangDao;

	public List queryJcdaohangs(Jcdaohang record,int page,int rows) {

		return jcdaohangDao.getJcdaohangList(record,page,rows);
	}

	public Jcdaohang getJcdaohang(int parseInt) {

		return jcdaohangDao.getJcdaohangById(parseInt);
	}

	public void modifyJcdaohang(Jcdaohang jcdaohang) {

		jcdaohangDao.update(jcdaohang);
	}

	public void deleteJcdaohang(Integer id) {

		jcdaohangDao.delete(id);

	}

	public void save(Jcdaohang jcdaohang) {

		jcdaohangDao.add(jcdaohang);

	}

}
