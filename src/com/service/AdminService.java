package com.service;

import com.entity.Admin;
import com.entity.AdminExample;

import java.util.List;

public interface AdminService {
	/**
	 * 管理员查询
	 * @param admin
	 * @return
	 */
	List<Admin> selectByAdminExample(AdminExample admin);
}
