package com.mapper;

import com.entity.Score;
import com.entity.Stuinfo;
import com.entity.StuinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuinfoMapper {
	
	//判断学生登录
	 Stuinfo CheckLogin(String aname, String apwd);
	 
	 List<Stuinfo> allstumail();
	 List<Score> allstuscore();

		Stuinfo SelectAllStuinfoOne(int sid);
		boolean UpdateStuinfo(int stuid);
    int countByExample(StuinfoExample example);

    int deleteByExample(StuinfoExample example);

    int deleteByPrimaryKey(Integer stuid);

    int insert(Stuinfo record);

    int insertSelective(Stuinfo record);

    List<Stuinfo> selectByExample(StuinfoExample example);

    Stuinfo selectByPrimaryKey(Integer stuid);

    int updateByExampleSelective(@Param("record") Stuinfo record, @Param("example") StuinfoExample example);

    int updateByExample(@Param("record") Stuinfo record, @Param("example") StuinfoExample example);

    int updateByPrimaryKeySelective(Stuinfo record);

    int updateByPrimaryKey(Stuinfo record);
}