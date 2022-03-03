package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjxiaoxiService {
	@Autowired
	private SjxiaoxiDao sjxiaoxiDao;

	public List querySjxiaoxis(Sjxiaoxi record,int page,int rows) {

		return sjxiaoxiDao.getSjxiaoxiList(record,page,rows);
	}

	public Sjxiaoxi getSjxiaoxi(int parseInt) {

		return sjxiaoxiDao.getSjxiaoxiById(parseInt);
	}

	public void modifySjxiaoxi(Sjxiaoxi sjxiaoxi) {

		sjxiaoxiDao.update(sjxiaoxi);
	}

	public void deleteSjxiaoxi(Integer id) {

		sjxiaoxiDao.delete(id);

	}

	public void save(Sjxiaoxi sjxiaoxi) {

		sjxiaoxiDao.add(sjxiaoxi);

	}

}
