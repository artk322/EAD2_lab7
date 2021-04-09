package com.example.Lab7_EAD2.servlets;

import com.example.Lab7_EAD2.bean.User;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login  extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        doPost(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        Map<Object, Object> map = new HashMap<Object, Object>();

        // todo: 完善登陆的细节

        if (null != name && !" ".equals(name)) {


            if (null != password && !" ".equals(password)) {

                String ps = (String) map.get("password");	// 数据库中对应用户名的密码

                if (ps.equals(password)) {

                    HttpSession session = req.getSession();

                    User user = new User();

                    user.setName(name);
                    user.setPassword(password);
                    user.setUserId((Integer) map.get("userId"));

                    session.setAttribute("loginer", user);

                    resp.sendRedirect("index.jsp");	// 登陆成功，跳转到首页 index.jsp

                } else {
                    resp.sendRedirect("login.jsp");
                }


            } else {
                resp.sendRedirect("login.jsp");
            }

        } else {
            resp.sendRedirect("login.jsp");
        }

    }
}
