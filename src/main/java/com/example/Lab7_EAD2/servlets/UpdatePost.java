package com.example.Lab7_EAD2.servlets;

import com.example.Lab7_EAD2.bean.Post;
import com.example.Lab7_EAD2.bean.User;

import javax.servlet.http.HttpServlet;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdatePost extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");

        // 存放构造的文件（图片）名
        File fullFile = null;

        // 存放标题和内容
        int pId = 0;
        String titles = null;
        String pContent = null;

        HttpSession session = req.getSession();

        int userId = ((User) session.getAttribute("user")).getUserId();

        Post post = new Post();

        post.setpId(pId);
        post.setTitles(titles);
        post.setpContent(pContent);

        //My Post update

        resp.sendRedirect("myself/mycenter.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        doGet(req, resp);

    }
}
