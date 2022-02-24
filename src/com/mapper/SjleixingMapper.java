package com.mapper;

import com.model.Sjleixing;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjleixingMapper {

    int deleteByPrimaryKey(Integer sjleixingId);

    int insert(Sjleixing record);

    Sjleixing selectByPrimaryKey(Integer sjleixingId);

    List<Sjleixing> selectAll(@Param("sjleixing")Sjleixing record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Sjleixing record);
}