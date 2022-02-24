package com.mapper;

import com.model.Jcpeizhi;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface JcpeizhiMapper {

    int deleteByPrimaryKey(Integer jcpeizhiId);

    int insert(Jcpeizhi record);

    Jcpeizhi selectByPrimaryKey(Integer jcpeizhiId);

    List<Jcpeizhi> selectAll(@Param("jcpeizhi")Jcpeizhi record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Jcpeizhi record);
}