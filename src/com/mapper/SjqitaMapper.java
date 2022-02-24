package com.mapper;

import com.model.Sjqita;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjqitaMapper {

    int deleteByPrimaryKey(Integer sjqitaId);

    int insert(Sjqita record);

    Sjqita selectByPrimaryKey(Integer sjqitaId);

    List<Sjqita> selectAll(@Param("sjqita")Sjqita record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Sjqita record);
}