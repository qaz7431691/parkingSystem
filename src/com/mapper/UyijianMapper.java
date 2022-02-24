package com.mapper;

import com.model.Uyijian;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UyijianMapper {

    int deleteByPrimaryKey(Integer uyijianId);

    int insert(Uyijian record);

    Uyijian selectByPrimaryKey(Integer uyijianId);

    List<Uyijian> selectAll(@Param("uyijian")Uyijian record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate);

    int updateByPrimaryKey(Uyijian record);
}