package com.mapper;

import com.model.Sjqita;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SjqitaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sjqita
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer sjqitaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sjqita
     *
     * @mbggenerated
     */
    int insert(Sjqita record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sjqita
     *
     * @mbggenerated
     */
    Sjqita selectByPrimaryKey(Integer sjqitaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sjqita
     *
     * @mbggenerated
     */
    List<Sjqita> selectAll(@Param("sjqita")Sjqita record,@Param("page")int page,@Param("rows")int rows);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sjqita
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sjqita record);
}