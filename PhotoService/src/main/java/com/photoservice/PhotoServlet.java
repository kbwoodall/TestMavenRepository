/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.photoservice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.*;
import com.photoservice.entity.Assignments;
import com.photoservice.PhotoExtract;
import java.util.List;

/**
 *
 * @author kwoodall
 */
public class PhotoServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String next = request.getParameter("next");

        String snxt = "";
        if (next.equalsIgnoreCase("less")) {
            int nxt = Integer.parseInt(id);
            nxt--;
            snxt = String.valueOf(nxt);
        }
        if (next.equalsIgnoreCase("greater")) {
            int nxt = Integer.parseInt(id);
            nxt++;
            snxt = String.valueOf(nxt);
        }
        id = snxt;

        response.setContentType("application/jsonrequest");

        Assignments a = new Assignments();
        List aList = new PhotoExtract().getPhotoInfoById(id);
        JSONObject obj = new JSONObject();

        if (aList.isEmpty()) {
            obj.put("id", "no id found");
        } else {
            a = (Assignments) aList.get(0);

            obj.put("id", id);
            obj.put("address", a.getAddress());
            obj.put("assignmentDue", a.getAssignmentDue().toString());
            obj.put("assignmentType", a.getAssignmentType());
            obj.put("canBeRescheduled", a.getCanBeRescheduled());
            obj.put("city", a.getCity());
            obj.put("contactName", a.getContactName());
            obj.put("contactPhone", a.getContactPhone());
            obj.put("created", a.getCreated().toString());
            obj.put("editorName", a.getEditorName());
            obj.put("editorPhone", a.getEditorPhone());
            obj.put("eventDate", a.getEventDate().toString());
            obj.put("notes", a.getNotes());
            obj.put("photoLocation", a.getPhotoLocation());
            obj.put("photoNotes", a.getPhotoNotes());
            obj.put("photoType", a.getPhotoType());
            obj.put("photographerName", a.getPhotographerName());
            obj.put("photographerPhone", a.getPhotographerPhone());
            obj.put("reporterName", a.getReporterName());
            obj.put("reporterPhone", a.getReporterPhone());
            obj.put("reporterThere", a.getReporterThere());
            obj.put("requestor", a.getRequestor());
            obj.put("runDate", a.getRunDate().toString());
            obj.put("sectionName", a.getSectionName());
            obj.put("shotsNeeded", a.getShotsNeeded());
            obj.put("storyIdea", a.getStoryIdea());
        }
        PrintWriter out = response.getWriter();
        out.println(obj);
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
