package com.logicode.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jjenkins on 10/12/2016.
 */
@WebServlet(name = "SimpleServlet", urlPatterns = {"/servletPath"})
public class SimpleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * execute this message when client navigates the the above urlPatterns /servletPath
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        java.util.Date today = new java.util.Date();
        out.println("<html>"+
                    "<body>"+
                    "<h1 align=center>Servlet</h1>"
                    +"<br>"+today+"</body>"+"<html>");
        System.out.println("Test the server!!");
    }
}
