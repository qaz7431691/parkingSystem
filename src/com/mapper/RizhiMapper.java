package com.mapper;

import com.model.Rizhi;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RizhiMapper {

	int deleteByPrimaryKey(Integer rizhiId);

	int insert(Rizhi record);

	Rizhi selectByPrimaryKey(Integer rizhiId);

	List<Rizhi> selectAll(@Param("rizhi")Rizhi record,@Param("page")int page,@Param("rows")int rows);

	int updateByPrimaryKey(Rizhi record);
}