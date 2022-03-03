package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class ShujuService {
	@Autowired
	private ShujuDao shujuDao;

	public List queryShujus(Shuju record,int page,int rows, String sdate, String edate, String sdate1, String edate1) {

		return shujuDao.getShujuList(record,page,rows,sdate,edate,sdate1,edate1);
	}

	public Shuju getShuju(int parseInt) {

		return shujuDao.getShujuById(parseInt);
	}

	public void modifyShuju(Shuju shuju) {

		shujuDao.update(shuju);
	}

	public void deleteShuju(Integer id) {

		shujuDao.delete(id);

	}

	public void save(Shuju shuju) {

		shujuDao.add(shuju);

	}

}
