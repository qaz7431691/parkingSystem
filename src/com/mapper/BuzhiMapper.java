package com.mapper;

import com.model.Buzhi;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuzhiMapper {

    int deleteByPrimaryKey(Integer buzhiId);

    int insert(Buzhi record);

    Buzhi selectByPrimaryKey(Integer buzhiId);

    List<Buzhi> selectAll(@Param("buzhi")Buzhi record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Buzhi record);
}