/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author NAUMAN
 */
@WebServlet(urlPatterns = {"/Check"})
public class Check extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int r = Integer.parseInt(request.getParameter("r"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Check</title>");            
            out.println("</head>");
            out.println("<body>");
            try
            {  
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prac","root","z");  
                PreparedStatement p=con.prepareStatement("select * from student where RollNo=?");
                p.setInt(1,r);
                ResultSet rs=p.executeQuery();  
                if(rs.next())  
                {
                    int s1,s2,s3,s4,s5;
                    s1=Integer.parseInt(rs.getString("Sub1"));
                    s2=Integer.parseInt(rs.getString("Sub2"));
                    s3=Integer.parseInt(rs.getString("Sub3"));
                    s4=Integer.parseInt(rs.getString("Sub4"));
                    s5=Integer.parseInt(rs.getString("Sub5"));
                    out.println("Name : "+rs.getString("Name")+"<br>");
                    out.println("Sub1 : "+s1+"<br>");
                    out.println("Sub2 : "+s2+"<br>");
                    out.println("Sub3 : "+s3+"<br>");
                    out.println("Sub4 : "+s4+"<br>");
                    out.println("Sub5 : "+s5+"<br>");
                    if(s1>39 && s2>39 && s3>39 && s4>39 && s5>39)
                        out.println("Congo!!! You are Passed.");
                    else
                        out.println("Sorry, You are Failed. Better Luck Next Time");
                    out.println("<br><a href='index.html'>Click here to go Back.</a>");
                }   
                else
                    out.println("No Rollno Found.<a href='index.html'>Click here to go Back.</a>");
                con.close();  
            }catch(Exception e){ out.println(e.getMessage());}  
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
