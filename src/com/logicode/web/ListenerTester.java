package com.logicode.web;

import com.logicode.model.Dog;

import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

/**
 * Created by jjenkins on 10/13/2016.
 */
@WebServlet(name = "ListenerTester", urlPatterns = {"/ListenerTester"})
public class ListenerTester extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        //set the content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("test the context attribute by listener<br>");
        out.println("<br>");
        //get the dog from the Servlet Context if the listener work the dog will be there
        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("Dog's breed is: " + dog.getDog());
    }
}