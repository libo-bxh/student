package com.mapper;

import com.entity.Examinfo;
import com.entity.ExaminfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExaminfoMapper {
	//查询全部
	List<Examinfo> exlist();
	List<Examinfo> allexam();
	//增加
	void exuser(Examinfo examinfo);
	
    int countByExample(ExaminfoExample example);

    int deleteByExample(ExaminfoExample example);

    int deleteByPrimaryKey(Integer emid);

    int insert(Examinfo record);

    int insertSelective(Examinfo record);

    List<Examinfo> selectByExample(ExaminfoExample example);

    Examinfo selectByPrimaryKey(Integer emid);

    int updateByExampleSelective(@Param("record") Examinfo record, @Param("example") ExaminfoExample example);

    int updateByExample(@Param("record") Examinfo record, @Param("example") ExaminfoExample example);

    int updateByPrimaryKeySelective(Examinfo record);

    int updateByPrimaryKey(Examinfo record);
    
    
}