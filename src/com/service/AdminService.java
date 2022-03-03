package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class AdminService {
	@Autowired
	private AdminDao adminDao;

	public List queryAdmins(Admin record,int page,int rows) {

		return adminDao.getAdminList(record,page,rows);
	}

	public Admin getAdmin(int parseInt) {

		return adminDao.getAdminById(parseInt);
	}

	public void modifyAdmin(Admin admin) {

		adminDao.update(admin);
	}

	public void deleteAdmin(Integer id) {

		adminDao.delete(id);

	}

	public void save(Admin admin) {

		adminDao.add(admin);

	}

}
