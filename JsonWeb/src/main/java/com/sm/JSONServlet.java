package com.sm;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.simple.*;


public class JSONServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/jsonrequest");
        
        JSONArray arrayObj = new JSONArray();
        arrayObj.add("MCA");
        arrayObj.add("Amit Kumar");
        arrayObj.add("19-12-1986");
        arrayObj.add(24);
        arrayObj.add("Scored");
        arrayObj.add(new Double(66.67));
        PrintWriter out = response.getWriter();
        out.println(arrayObj);        
    }
}