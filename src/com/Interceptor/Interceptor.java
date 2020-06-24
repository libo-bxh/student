package com.Interceptor;

import com.entity.Admin;
import com.entity.Stuinfo;
import com.entity.Tehinfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {
    /*最后处理*/
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }

    /*返回后处理*/
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {

    }

    /*预处理*/
    @Override
    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
        // TODO Auto-generated method stub
        String uri = arg0.getRequestURI();
        if (uri.equals("/students/GoLogin")) {
            System.out.println(uri);
            return true;
        }

        @SuppressWarnings("deprecation")
        Admin admin = (Admin) arg0.getSession().getAttribute("aid");
        Stuinfo stu = (Stuinfo) arg0.getSession().getAttribute("aid");
        Tehinfo te = (Tehinfo) arg0.getSession().getAttribute("aid");
        if (admin != null || stu != null || te != null) {
            return true;
        }
        arg0.getRequestDispatcher("login.jsp").forward(arg0, arg1);
        return false;
    }

}
