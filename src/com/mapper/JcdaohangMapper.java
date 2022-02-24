package com.mapper;

import com.model.Jcdaohang;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface JcdaohangMapper {

    int deleteByPrimaryKey(Integer jcdaohangId);

    int insert(Jcdaohang record);

    Jcdaohang selectByPrimaryKey(Integer jcdaohangId);

    List<Jcdaohang> selectAll(@Param("jcdaohang")Jcdaohang record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Jcdaohang record);
}