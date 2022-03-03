package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class BuyuanService {
	@Autowired
	private BuyuanDao buyuanDao;

	public List queryBuyuans(Buyuan record,int page,int rows) {

		return buyuanDao.getBuyuanList(record,page,rows);
	}

	public Buyuan getBuyuan(int parseInt) {

		return buyuanDao.getBuyuanById(parseInt);
	}

	public void modifyBuyuan(Buyuan buyuan) {

		buyuanDao.update(buyuan);
	}

	public void deleteBuyuan(Integer id) {

		buyuanDao.delete(id);

	}

	public void save(Buyuan buyuan) {

		buyuanDao.add(buyuan);

	}

}
