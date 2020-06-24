package com.controller;

import com.base.ActionResult;
import com.entity.Admin;
import com.entity.AdminExample;
import com.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @version 1.0
 * @Author: Beau li
 * @Date: Created in 19:07 2020/6/21
 */
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private AdminService adminserver;

    @RequestMapping(value = "GoLogin", method = {RequestMethod.GET, RequestMethod.POST})
    public String login(String name, String pwd, HttpServletRequest request, HttpSession session) {
        int type = Integer.valueOf(request.getParameter("type").toString());
        if (type == 1) {
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria cr = adminExample.createCriteria();
            cr.andAnameEqualTo(name);
            cr.andApwdEqualTo(pwd);
            List<Admin> list = adminserver.selectByAdminExample(adminExample);
            if (list.size() > 0) {
                Integer aid = list.get(0).getAid();
                //创建session
                session.setAttribute("aid", aid);
                session.setAttribute("aname", name);
                session.setAttribute("type", "1");
                session.setAttribute("typename", "管理员");
                return "index1";
            } else {
                return "error";
            }
        }
        return "";
    }
}
