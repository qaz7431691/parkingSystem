package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class JcpeizhiService {
	@Autowired
	private JcpeizhiDao jcpeizhiDao;

	public List queryJcpeizhis(Jcpeizhi record,int page,int rows) {

		return jcpeizhiDao.getJcpeizhiList(record,page,rows);
	}

	public Jcpeizhi getJcpeizhi(int parseInt) {

		return jcpeizhiDao.getJcpeizhiById(parseInt);
	}

	public void modifyJcpeizhi(Jcpeizhi jcpeizhi) {

		jcpeizhiDao.update(jcpeizhi);
	}

	public void deleteJcpeizhi(Integer id) {

		jcpeizhiDao.delete(id);

	}

	public void save(Jcpeizhi jcpeizhi) {

		jcpeizhiDao.add(jcpeizhi);

	}

}
