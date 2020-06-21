package com.mapper;

import com.entity.Admin;
import com.entity.AdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    /**
     * 判断管理员登录
     */
	Admin CheckLogin(String aname, String apwd);

    List<Admin> selectByExample(AdminExample example);

    int countByExample(AdminExample example);
    int deleteByExample(AdminExample example);
    int deleteByPrimaryKey(Integer aid);
    int insert(Admin record);
    int insertSelective(Admin record);


    Admin selectByPrimaryKey(Integer aid);
    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);
    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
    int updateByPrimaryKeySelective(Admin record);
    int updateByPrimaryKey(Admin record);
}