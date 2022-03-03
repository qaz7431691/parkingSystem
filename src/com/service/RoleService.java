package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.*;

@Service
public class RoleService {
	@Autowired
	private RoleDao roleDao;

	public List queryRoles(Role record,int page,int rows) {

		return roleDao.getRoleList(record,page,rows);
	}

	public Role getRole(int parseInt) {

		return roleDao.getRoleById(parseInt);
	}

	public void modifyRole(Role role) {

		roleDao.update(role);
	}

	public void deleteRole(Integer id) {

		roleDao.delete(id);

	}

	public void save(Role role) {

		roleDao.add(role);

	}

}
