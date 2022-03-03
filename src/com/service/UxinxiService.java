package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class UxinxiService {
	@Autowired
	private UxinxiDao uxinxiDao;

	public List queryUxinxis(Uxinxi record,int page,int rows, String sdate, String edate) {

		return uxinxiDao.getUxinxiList(record,page,rows,sdate,edate);
	}

	public Uxinxi getUxinxi(int parseInt) {

		return uxinxiDao.getUxinxiById(parseInt);
	}

	public void modifyUxinxi(Uxinxi uxinxi) {

		uxinxiDao.update(uxinxi);
	}

	public void deleteUxinxi(Integer id) {

		uxinxiDao.delete(id);

	}

	public void save(Uxinxi uxinxi) {

		uxinxiDao.add(uxinxi);

	}

}
