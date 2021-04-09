package com.example.Lab7_EAD2.servlets;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Registration extends HttpServlet {
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

        String name = req.getParameter("name"); // 用户名
        String pass = req.getParameter("pass"); // 密码
        String pass2 = req.getParameter("pass2"); // 确认密码

        HttpSession session = req.getSession();

        if (pass.equals(pass2)) {



            Map<Object, Object> map = new HashMap<Object, Object>();

            map.put("name", name);
            map.put("password", pass);


            resp.sendRedirect("login.jsp");

        } else {
            resp.sendRedirect("register.jsp");
        }

    }
}
