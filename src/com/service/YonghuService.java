package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class YonghuService {
	@Autowired
	private YonghuDao yonghuDao;

	public List queryYonghus(Yonghu record,String yonghuName,int page,int rows, String sdate, String edate, String sdate1, String edate1) {

		return yonghuDao.getYonghuList(record,yonghuName,page,rows,sdate,edate,sdate1,edate1);
	}

	public Yonghu getYonghu(int parseInt) {

		return yonghuDao.getYonghuById(parseInt);
	}

	public void modifyYonghu(Yonghu yonghu) {

		yonghuDao.update(yonghu);
	}

	public void deleteYonghu(Integer id) {

		yonghuDao.delete(id);

	}

	public void save(Yonghu yonghu) {

		yonghuDao.add(yonghu);

	}

}
