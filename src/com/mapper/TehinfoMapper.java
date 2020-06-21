package com.mapper;


import com.entity.Tehinfo;
import com.entity.TehinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TehinfoMapper {
    //判断教师登录
    Tehinfo CheckLogin(String aname, String apwd);

    //查询所有教师
    List<Tehinfo> selectAll();

    int countByExample(TehinfoExample example);

    int deleteByExample(TehinfoExample example);

    int deleteByPrimaryKey(Integer tehid);

    int insert(Tehinfo record);

    int insertSelective(Tehinfo record);

    List<Tehinfo> selectByExample(TehinfoExample example);

    Tehinfo selectByPrimaryKey(Integer tehid);

    int updateByExampleSelective(@Param("record") Tehinfo record, @Param("example") TehinfoExample example);

    int updateByExample(@Param("record") Tehinfo record, @Param("example") TehinfoExample example);

    int updateByPrimaryKeySelective(Tehinfo record);

    int updateByPrimaryKey(Tehinfo record);
}