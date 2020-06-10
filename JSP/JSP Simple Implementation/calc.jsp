<%-- 
    Document   : calc
    Created on : 10 Apr, 2018, 12:17:57 AM
    Author     : NAUMAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int n = Integer.parseInt(request.getParameter("n"));
            out.println(n+" is "+(n%2==0?"Even Number":"Odd Number")+"<br>");
            int f=0;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    f=1;
                    break;
                }
            }
            out.println(n+" is "+(f==0?"a Prime Number":"Not a Prime Number")+"<br>");
            for(int i=1;i<=10;i++)
                out.println(n+"*"+i+"="+n*i+"<br>");
        %>
    </body>
</html>
