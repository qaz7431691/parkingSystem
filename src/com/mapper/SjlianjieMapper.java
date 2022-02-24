package com.mapper;

import com.model.Sjlianjie;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjlianjieMapper {

    int deleteByPrimaryKey(Integer sjlianjieId);

    int insert(Sjlianjie record);

    Sjlianjie selectByPrimaryKey(Integer sjlianjieId);

    List<Sjlianjie> selectAll(@Param("sjlianjie")Sjlianjie record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Sjlianjie record);
}