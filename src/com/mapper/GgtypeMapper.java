package com.mapper;

import com.model.Ggtype;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GgtypeMapper {

    int deleteByPrimaryKey(Integer ggtypeId);

    int insert(Ggtype record);

    Ggtype selectByPrimaryKey(Integer ggtypeId);

    List<Ggtype> selectAll(@Param("ggtype")Ggtype record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Ggtype record);
}