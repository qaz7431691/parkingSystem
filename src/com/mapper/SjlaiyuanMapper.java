package com.mapper;

import com.model.Sjlaiyuan;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjlaiyuanMapper {

    int deleteByPrimaryKey(Integer sjlaiyuanId);

    int insert(Sjlaiyuan record);

    Sjlaiyuan selectByPrimaryKey(Integer sjlaiyuanId);

    List<Sjlaiyuan> selectAll(@Param("sjlaiyuan")Sjlaiyuan record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Sjlaiyuan record);
}