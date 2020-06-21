package com.service.impl;


import com.entity.Admin;
import com.entity.AdminExample;
import com.mapper.AdminMapper;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminmapper;

    @Override
    public List<Admin> selectByAdminExample(AdminExample admin) {
        List<Admin> list = adminmapper.selectByExample(admin);
        return list;
    }
}
