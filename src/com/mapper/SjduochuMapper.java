package com.mapper;

import com.model.Sjduochu;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjduochuMapper {

    int deleteByPrimaryKey(Integer sjduochuId);

    int insert(Sjduochu record);

    Sjduochu selectByPrimaryKey(Integer sjduochuId);

	List<Sjduochu> selectAll(@Param("sjduochu")Sjduochu record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Sjduochu record);
}