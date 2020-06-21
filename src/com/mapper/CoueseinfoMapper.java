package com.mapper;

import com.entity.Coueseinfo;
import com.entity.CoueseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoueseinfoMapper {
    int countByExample(CoueseinfoExample example);

    int deleteByExample(CoueseinfoExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(Coueseinfo record);

    int insertSelective(Coueseinfo record);

    List<Coueseinfo> selectByExample(CoueseinfoExample example);

    Coueseinfo selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") Coueseinfo record, @Param("example") CoueseinfoExample example);

    int updateByExample(@Param("record") Coueseinfo record, @Param("example") CoueseinfoExample example);

    int updateByPrimaryKeySelective(Coueseinfo record);

    int updateByPrimaryKey(Coueseinfo record);
}