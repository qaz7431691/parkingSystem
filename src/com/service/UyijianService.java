package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class UyijianService {
	@Autowired
	private UyijianDao uyijianDao;

	public List queryUyijians(Uyijian record,int page,int rows, String sdate, String edate) {

		return uyijianDao.getUyijianList(record,page,rows,sdate,edate);
	}

	public Uyijian getUyijian(int parseInt) {

		return uyijianDao.getUyijianById(parseInt);
	}

	public void modifyUyijian(Uyijian uyijian) {

		uyijianDao.update(uyijian);
	}

	public void deleteUyijian(Integer id) {

		uyijianDao.delete(id);

	}

	public void save(Uyijian uyijian) {

		uyijianDao.add(uyijian);

	}

}
