package com.sm.mavensqlutil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hibernate.*;
import com.sm.mavensqlutil.*;
import org.hibernate.*;
import com.sm.mavensqlutil.util.*;
import java.util.*;
import com.sm.mavensqlutil.entity.ShootingsIncident;

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

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery("from ShootingsIncident");
            List resultsList = q.list();
            System.out.println("Number of incidents: " + resultsList.size());
            
            List<ShootingsIncident> list;
            list = resultsList;
         
            for (ShootingsIncident si : list) {
                if (si.getNatureOfIncident().isEmpty()) {
                    System.out.println("THIS ONE WAS EMPTY");
                } else {
                    System.out.println(si.getNatureOfIncident());
                }
            }

        } catch (HibernateException he) {
        }
        
        System.out.println("Testing MavenSqlUtil");
        assertTrue(true);
    }
}
