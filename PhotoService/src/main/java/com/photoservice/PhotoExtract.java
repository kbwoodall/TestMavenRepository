/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.photoservice;

import org.hibernate.*;
import com.photoservice.entity.Assignments;
import java.util.*;

public class PhotoExtract {

    public List getPhotoInfoById(String sValue) {

        List resultsList = null;

        try {
            int iValue = Integer.parseInt(sValue);

            Session session = PhotoHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Assignments assignments = new Assignments();

            Query q = session.createQuery("from Assignments where id = :value");
            q.setParameter("value", iValue);

            resultsList = q.list();  

        } catch (HibernateException he) {
        }
        return resultsList;
    }

    public boolean updatePhotoInfoById(String sValue) {

        boolean updated = false;

        try {

            int iValue = Integer.parseInt(sValue);

            Transaction tx = null;
            Session session = PhotoHibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            Assignments assignments = new Assignments();

            assignments.setAddress("3333 Bonanza");
            assignments.setAssignmentDue(new Date());
            assignments.setAssignmentType("a");
            assignments.setCanBeRescheduled(Boolean.TRUE);
            assignments.setCity("Las Vegas");
            assignments.setContactName("b");
            assignments.setContactPhone("c");
            assignments.setCreated(new Date());
            assignments.setEditorName("d");
            assignments.setEditorPhone("e");
            assignments.setEventDate(new Date());
            assignments.setId(iValue);
            assignments.setNotes("f");
            assignments.setPhotoLocation("g");
            assignments.setPhotoNotes("h");
            assignments.setPhotoType("i");
            assignments.setPhotographerName("j");
            assignments.setPhotographerPhone("k");
            assignments.setReporterName("l");
            assignments.setReporterPhone("m");
            assignments.setReporterThere(Boolean.TRUE);
            assignments.setRequestor("n");
            assignments.setRunDate(new Date());
            assignments.setSectionName("o");
            assignments.setShotsNeeded(Boolean.TRUE);
            assignments.setStoryIdea("p");

            session.saveOrUpdate(assignments);
            
            System.out.println("Update address " + assignments.getAddress());
                                
            updated = true;
            tx.commit();

        } catch (HibernateException he) {
        }
        return updated;
    }
}
