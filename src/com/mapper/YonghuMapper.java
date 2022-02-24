package com.mapper;

import com.model.Yonghu;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface YonghuMapper {

    int deleteByPrimaryKey(Integer yonghuId);

    int insert(Yonghu record);

    Yonghu selectByPrimaryKey(Integer yonghuId);

	List<Yonghu> selectAll(@Param("yonghu")Yonghu record,@Param("yonghuName")String yonghuName,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Yonghu record);
}