package com.mapper;

import com.model.Sjjianchu;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjjianchuMapper {

    int deleteByPrimaryKey(Integer sjjianchuId);

    int insert(Sjjianchu record);

    Sjjianchu selectByPrimaryKey(Integer sjjianchuId);

	List<Sjjianchu> selectAll(@Param("sjjianchu")Sjjianchu record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Sjjianchu record);
}