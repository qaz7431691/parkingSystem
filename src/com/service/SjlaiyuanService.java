package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class SjlaiyuanService {
	@Autowired
	private SjlaiyuanDao sjlaiyuanDao;

	public List querySjlaiyuans(Sjlaiyuan record,int page,int rows) {

		return sjlaiyuanDao.getSjlaiyuanList(record,page,rows);
	}

	public Sjlaiyuan getSjlaiyuan(int parseInt) {

		return sjlaiyuanDao.getSjlaiyuanById(parseInt);
	}

	public void modifySjlaiyuan(Sjlaiyuan sjlaiyuan) {

		sjlaiyuanDao.update(sjlaiyuan);
	}

	public void deleteSjlaiyuan(Integer id) {

		sjlaiyuanDao.delete(id);

	}

	public void save(Sjlaiyuan sjlaiyuan) {

		sjlaiyuanDao.add(sjlaiyuan);

	}

}
