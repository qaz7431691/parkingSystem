package com.mapper;

import com.model.Sjxingtai;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjxingtaiMapper {

    int deleteByPrimaryKey(Integer sjxingtaiId);

    int insert(Sjxingtai record);

    Sjxingtai selectByPrimaryKey(Integer sjxingtaiId);

    List<Sjxingtai> selectAll(@Param("sjxingtai")Sjxingtai record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Sjxingtai record);
}