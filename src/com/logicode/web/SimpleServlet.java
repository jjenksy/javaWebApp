package com.logicode.web;

import com.logicode.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by jjenkins on 10/12/2016.
 */
@WebServlet(name = "SimpleServletName", urlPatterns = {"/servletPath","/SimpleServlet.do"},
            initParams = {
                   //this param is only accessed by the single servlet
                    @WebInitParam(name="John", value = "jjenksy@gmail.com")
            })

public class SimpleServlet extends HttpServlet {
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //get the user agent
        String userAgent = request.getHeader("User-Agent");

        //get the binary input stream
        //ServletInputStream stream = request.getInputStream();
        //the selection
        String c = request.getParameter("color");

        //get the body elem
        String body = request.getParameter("body");

        //get the array of select check boxes
        String[] checkBoxes = request.getParameterValues("optionsRadios");
        //instantiate the Model class
        Model val = new Model();
        //call the get vals method and return the result to a list
        List valResult = val.getVals(c);


        //add an attribute to the request object for the jsp to use
        request.setAttribute("styles",valResult);
        //add another attribute for the body
        request.setAttribute("body", body);
        //set the admin attr for the jsp to display get it from the web context
        request.setAttribute("admin",getServletContext().getInitParameter("adminEmail"));


        //instantiate the request dipatcher for the JSP add the jsp as the arg
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        //crank up the jsp sending the request and reponse
        response.setContentType("text/html");
        view.forward(request,response);

        for(int i = 0; i<checkBoxes.length; i++){
            System.out.println(checkBoxes[i]);
        }
        System.out.println(userAgent);





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
