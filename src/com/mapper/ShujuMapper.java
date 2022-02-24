package com.mapper;

import com.model.Shuju;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ShujuMapper {

    int deleteByPrimaryKey(Integer shujuId);

    int insert(Shuju record);

    Shuju selectByPrimaryKey(Integer shujuId);

	List<Shuju> selectAll(@Param("shuju")Shuju record,@Param("page")int page,@Param("rows")int rows, @Param("sdate")String sdate, @Param("edate")String edate, @Param("sdate1")String sdate1, @Param("edate1")String edate1);

    int updateByPrimaryKey(Shuju record);
}