package com.mapper;

import com.model.Jcbiaoti;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface JcbiaotiMapper {

    int deleteByPrimaryKey(Integer jcbiaotiId);

    int insert(Jcbiaoti record);

    Jcbiaoti selectByPrimaryKey(Integer jcbiaotiId);

    List<Jcbiaoti> selectAll(@Param("jcbiaoti")Jcbiaoti record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Jcbiaoti record);
}