package com.mapper;

import com.model.Uxtype;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UxtypeMapper {

    int deleteByPrimaryKey(Integer uxtypeId);

    int insert(Uxtype record);

    Uxtype selectByPrimaryKey(Integer uxtypeId);

    List<Uxtype> selectAll(@Param("uxtype")Uxtype record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Uxtype record);
}