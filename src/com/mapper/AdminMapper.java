package com.mapper;

import com.model.Admin;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AdminMapper {

	int deleteByPrimaryKey(Integer adminId);

	int insert(Admin record);

	Admin selectByPrimaryKey(Integer adminId);

	List<Admin> selectAll(@Param("admin")Admin record,@Param("page")int page,@Param("rows")int rows);

	int updateByPrimaryKey(Admin record);
}