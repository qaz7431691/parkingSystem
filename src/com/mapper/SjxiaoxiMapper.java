package com.mapper;

import com.model.Sjxiaoxi;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjxiaoxiMapper {

    int deleteByPrimaryKey(Integer sjxiaoxiId);

    int insert(Sjxiaoxi record);

    Sjxiaoxi selectByPrimaryKey(Integer sjxiaoxiId);

    List<Sjxiaoxi> selectAll(@Param("sjxiaoxi")Sjxiaoxi record,@Param("page")int page,@Param("rows")int rows);

    int updateByPrimaryKey(Sjxiaoxi record);
}