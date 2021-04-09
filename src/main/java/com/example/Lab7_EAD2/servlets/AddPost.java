package com.example.Lab7_EAD2.servlets;

import com.example.Lab7_EAD2.bean.Post;
import com.example.Lab7_EAD2.bean.User;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddPost extends HttpServlet {
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

        String title = req.getParameter("title");
        String pContent = req.getParameter("pContent");;

        HttpSession session = req.getSession();

        User user = (User) session.getAttribute("loginer");

        int userId = user.getUserId();
        String userName = user.getName();

        Post post = new Post();


        post.setTitles(title);
        post.setpContent(pContent);
        post.setUserId(userId);
        post.setUserName(userName);


        resp.sendRedirect("index.jsp");

    }

}
