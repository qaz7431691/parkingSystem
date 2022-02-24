package com.mapper;

import com.model.Sjpinglun;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjpinglunMapper {

    int deleteByPrimaryKey(Integer sjpinglunId);

    int insert(Sjpinglun record);

    Sjpinglun selectByPrimaryKey(Integer sjpinglunId);

	List<Sjpinglun> selectAll(@Param("sjpinglun")Sjpinglun record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Sjpinglun record);
}