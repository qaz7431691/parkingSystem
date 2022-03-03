package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class GgpinglunService {
	@Autowired
	private GgpinglunDao ggpinglunDao;

	public List queryGgpingluns(Ggpinglun record,int page,int rows, String sdate, String edate, String sdate1, String edate1) {

		return ggpinglunDao.getGgpinglunList(record,page,rows,sdate,edate,sdate1,edate1);
	}

	public Ggpinglun getGgpinglun(int parseInt) {

		return ggpinglunDao.getGgpinglunById(parseInt);
	}

	public void modifyGgpinglun(Ggpinglun ggpinglun) {

		ggpinglunDao.update(ggpinglun);
	}

	public void deleteGgpinglun(Integer id) {

		ggpinglunDao.delete(id);

	}

	public void save(Ggpinglun ggpinglun) {

		ggpinglunDao.add(ggpinglun);

	}

}
