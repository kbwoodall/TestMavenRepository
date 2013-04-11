/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.*;

/**
 *
 * @author kwoodall
 */
public class JsonGetter extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/jsonrequest");
        //response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JsonGetter</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JsonGetter at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
                       
            
        String dblQuote = "\"";
        String comma = ",";
        String lBrace = "{";
        String rBrace = "}";

        String str = lBrace
                + dblQuote
                + "name"
                + dblQuote
                + ": "
                + dblQuote
                + "Babe Ruth"
                + dblQuote
                + rBrace;
        System.out.println("String is : " + str);           
        
        String aTitle = "HAPPY 50TH BIRTHDAY BOBBY";
        String aText = "May all your wishes and Sweet dreams come true Because of the wonderful things That you always say and do John, Connie, Zita, Carlos, and Mike";
        String aId = "159343";
                
        String bTitle = "Bob and Pat McNutt";            
        String bId = "61595";        
        String bText = "Long time residents, Bob and Pat McNutt celebrated their 60th wedding anniversary on July 12th. Family and friends joined in the celebration at First Presbyterian Church, yesterday, July 14th. Bob and Pat grew up together in Stanton, MI and both graduated from the local high school. Bob graduated from the University of Cincinnati with a degree in civil engineering. He served in the Army Corp of Engineers during WWII. Bob has been a registered Civil Engineer in Nevada for the past 45 years. Pat graduated from UNLV and started her career as a teacher. After 23 years she retired to only become Director of First Presbyterian Academy for another 5 years. Pat and Bob have been very active in professional and civic organizations. Their two daughters, Marcia and Jane, and their husbands, along with grandchildren and great grandchildren will came together to celebrate and rejoice their 60 years of marriage.";
             
        JSONObject aObject = new JSONObject();
        aObject.put("id", aId);
        aObject.put("title", aTitle);
        aObject.put("text", aText);        
                
        JSONObject bObject = new JSONObject();
        bObject.put("id", bId);
        bObject.put("title", bTitle);
        bObject.put("text", bText);                       
        
        JSONArray jArray = new JSONArray();
        
        jArray.add(aObject);
        jArray.add(bObject);    
        
        out.println(jArray.toJSONString());
            
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
