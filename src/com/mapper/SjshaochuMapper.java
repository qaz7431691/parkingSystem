package com.mapper;

import com.model.Sjshaochu;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjshaochuMapper {

    int deleteByPrimaryKey(Integer sjshaochuId);

    int insert(Sjshaochu record);

    Sjshaochu selectByPrimaryKey(Integer sjshaochuId);

	List<Sjshaochu> selectAll(@Param("sjshaochu")Sjshaochu record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Sjshaochu record);
}