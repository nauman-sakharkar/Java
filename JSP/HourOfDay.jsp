<%-- 
    Document   : calcMessage
    Created on : 10 Apr, 2018, 12:26:27 AM
    Author     : NAUMAN
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Calendar now = Calendar.getInstance();
            int h = now.get(Calendar.HOUR_OF_DAY);
            if(h>=5 && h<12)
                out.println("Good Morning");
            else if(12<=h && h<=16)
                out.println("Good Afternoon");
            else if(h>16 && h<19)
                out.println("Good Evening");
            else
                out.println("Good Night");
        %>
    </body>
</html>
