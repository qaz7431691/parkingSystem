package com.mapper;

import com.model.Uxinxi;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UxinxiMapper {

    int deleteByPrimaryKey(Integer uxinxiId);

    int insert(Uxinxi record);

    Uxinxi selectByPrimaryKey(Integer uxinxiId);

    List<Uxinxi> selectAll(@Param("uxinxi")Uxinxi record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate);

    int updateByPrimaryKey(Uxinxi record);
}