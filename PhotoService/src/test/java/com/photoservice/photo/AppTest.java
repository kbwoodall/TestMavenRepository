package com.photoservice.photo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.*;
import com.photoservice.PhotoHibernateUtil;
import java.util.*;
import com.photoservice.entity.Assignments;
import com.photoservice.PhotoExtract;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        try {
            PhotoExtract px = new PhotoExtract();
            boolean updated = px.updatePhotoInfoById("2");

            if (updated) {
                System.out.println("Updated correctly");
            } else {
                System.out.println("Updated in error");
            }

            List pList = px.getPhotoInfoById("2");
            System.out.println("Number of assignment entries: " + pList.size());
            
            Assignments assignments = new Assignments();
            assignments = (Assignments) pList.get(0);
            System.out.println("ID is: " + assignments.getId());
            System.out.println("Address is: " + assignments.getAddress());

        } catch (HibernateException he) {
        }

        System.out.println("Testing NewMaven");
        assertTrue(true);
    }
}
