package com.mapper;

import com.model.Role;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

	int deleteByPrimaryKey(Integer roleId);

	int insert(Role record);

	Role selectByPrimaryKey(Integer roleId);

    List<Role> selectAll(@Param("role")Role record,@Param("page")int page,@Param("rows")int rows);

	int updateByPrimaryKey(Role record);
}