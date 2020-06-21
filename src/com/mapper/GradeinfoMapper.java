package com.mapper;

import com.entity.Gradeinfo;
import com.entity.GradeinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeinfoMapper {
    int countByExample(GradeinfoExample example);

    int deleteByExample(GradeinfoExample example);

    int deleteByPrimaryKey(Integer gaid);

    int insert(Gradeinfo record);

    int insertSelective(Gradeinfo record);
    
    List<Gradeinfo> selectByExample(GradeinfoExample example);

    Gradeinfo selectByPrimaryKey(Integer gaid);

    int updateByExampleSelective(@Param("record") Gradeinfo record, @Param("example") GradeinfoExample example);

    int updateByExample(@Param("record") Gradeinfo record, @Param("example") GradeinfoExample example);

    int updateByPrimaryKeySelective(Gradeinfo record);

    int updateByPrimaryKey(Gradeinfo record);
}