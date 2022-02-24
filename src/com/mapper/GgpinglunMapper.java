package com.mapper;

import com.model.Ggpinglun;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GgpinglunMapper {

    int deleteByPrimaryKey(Integer ggpinglunId);

    int insert(Ggpinglun record);

    Ggpinglun selectByPrimaryKey(Integer ggpinglunId);

	List<Ggpinglun> selectAll(@Param("ggpinglun")Ggpinglun record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Ggpinglun record);
}