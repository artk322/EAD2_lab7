package com.example.Lab7_EAD2.servlets;

import com.example.Lab7_EAD2.bean.Post;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetPost extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // url /post/* 调用的是 doGet() 方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        Post post = new Post();

        Map<Object, Object> m = new HashMap<Object, Object>();


        post.setTitles((String) m.get("title"));
        post.setpContent((String) m.get("pContent"));
        post.setpId((Integer) m.get("pId"));
        post.setUserId((Integer) m.get("userId"));
        post.setUserName((String) m.get("userName"));

        // 这是你点击的单个 Post 页面
        req.setAttribute("post", post);

        RequestDispatcher rd;
        rd = req.getRequestDispatcher("/post.jsp");
        rd.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        doGet(req, resp);

    }
}
