package com.mapper;

import com.model.Buyuan;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BuyuanMapper {

    int deleteByPrimaryKey(Integer buyuanId);

    int insert(Buyuan record);

    Buyuan selectByPrimaryKey(Integer buyuanId);

    List<Buyuan> selectAll(@Param("buyuan")Buyuan record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Buyuan record);
}