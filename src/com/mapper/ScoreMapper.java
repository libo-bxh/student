package com.mapper;

import com.entity.Score;
import com.entity.ScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper {
	
	List<Score> SelectAllScore();
	List<Score> sclist();
	
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    Score selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}