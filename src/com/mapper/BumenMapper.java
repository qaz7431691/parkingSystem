package com.mapper;

import com.model.Bumen;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BumenMapper {

    int deleteByPrimaryKey(Integer bumenId);

    int insert(Bumen record);

    Bumen selectByPrimaryKey(Integer bumenId);

    List<Bumen> selectAll(@Param("bumen")Bumen record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Bumen record);
}