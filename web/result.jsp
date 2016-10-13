<%--
  Created by IntelliJ IDEA.
  User: jjenkins
  Date: 10/12/2016
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
      <head>
          <meta charset="UTF-8">
          <title>Title</title>
          <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      </head>
  <body>
  <div class="container">
  <%
    //java code
    List styles = (List)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()){
      out.print("<br>try: " + it.next());
    }


  %>

      <%--More jsp code--%>
     <div class="alert"><% out.println(request.getAttribute("body")); %></div>
     <div class="content"> <%out.println(request.getAttribute("admin")); %></div>

  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </body>
</html>
