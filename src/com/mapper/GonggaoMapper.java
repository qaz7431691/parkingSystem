package com.mapper;

import com.model.Gonggao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GonggaoMapper {

	int deleteByPrimaryKey(Integer gonggaoId);

	int insert(Gonggao record);

	Gonggao selectByPrimaryKey(Integer gonggaoId);

	List<Gonggao> selectAll(@Param("gonggao")Gonggao record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate);

	int updateByPrimaryKey(Gonggao record);
}