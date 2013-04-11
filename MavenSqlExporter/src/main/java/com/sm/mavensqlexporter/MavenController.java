/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.mavensqlexporter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sm.JsonSqlExporter;
import net.sf.json.JSONArray;

/**
 *
 * @author kwoodall
 */
public class MavenController extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            JsonSqlExporter js = new JsonSqlExporter();
            String jString = js.hibernateTest();
            System.out.println("jString: " + jString);

            //JSONArray arrayObj = new JSONArray();
            //arrayObj.add("MCA");
            //arrayObj.add("Amit Kumar");
            //arrayObj.add("19-12-1986");
            //arrayObj.add(24);
            //arrayObj.add("Scored");
            //arrayObj.add(new Double(66.67));
            //PrintWriter out = response.getWriter();
            //out.println(arrayObj);
            //for (int i = 0; i < arrayObj.size(); i++) {
            //    out.println(arrayObj.getString(i));
            //}
            
            //TODO output your page here
            //out.println("<html>");
            //out.println("<head>");
            //out.println("<title>Servlet MavenController</title>");
            //out.println("</head>");
            //out.println("<body>");
            //out.println("<h1>Servlet MavenController at " + request.getContextPath() + "</h1>");
            //out.println("<h2>Servlet MavenController ran successfully " + "</h1>");

            //String jStr = '[{"id":"1","natureOfIncident":"Stolen car suspect"},{"id":"2","natureOfIncident":"Person with a gun"},{"id":"3","natureOfIncident":"Undercover operation"},{"id":"4","natureOfIncident":"Struck by vehicle"}]';
            String s = "{" + "'message'" + ":" + "'No Content'" + "," + "'error'" + ":" + "'204'" + "}";
             
            //{"message": "No Content", "error": "204"}
            
            //out.println(jString);
            out.println(s);
            
            //out.println("</body>");
            //out.println("</html>");

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

