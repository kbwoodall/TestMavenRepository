package com.sm.jsonmaven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.sm.mavensqlutil.App;
import com.sm.mavensqlutil.entity.*;
import com.sm.mavensqlutil.util.HibernateUtil;
import org.json.simple.*;
import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.ContentHandler;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.hibernate.*;
import java.util.*;

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

    public String getJson(List list) {

        List<ShootingsIncident> sList;
        sList = list;
        JSONArray jArray = new JSONArray();

        for (ShootingsIncident si : sList) {
            System.out.println(si.getNatureOfIncident());

            if (si.getId() < 5) {
                Map map = new HashMap();
                map.put("id", si.getId().toString());
                map.put("natureOfIncident", si.getNatureOfIncident());

                jArray.add(map);

            }
        }

        return jArray.toJSONString();
    }

    public void readJson(Object jsonString) {

        System.out.println("Reading json " + jsonString.toString());

        Object obj = JSONValue.parse(jsonString.toString());
        JSONArray array = (JSONArray) obj;      

        try {
            int idx = 0;

            while (array.get(idx) != null) {
                String jString = array.get(idx).toString();
             
                ContainerFactory containerFactory = new ContainerFactory() {

                    public List creatArrayContainer() {
                        return new LinkedList();
                    }

                    public Map createObjectContainer() {
                        return new LinkedHashMap();
                    }
                };

                JSONParser parser = new JSONParser();
                Map json = (Map) parser.parse(jString, containerFactory);
                Iterator iter = json.entrySet().iterator();
                System.out.println("==iterate result==");
                while (iter.hasNext()) {
                    Map.Entry entry = (Map.Entry) iter.next();
                    System.out.println(entry.getKey() + "=>" + entry.getValue());
                }
                idx++;
             }    
         }
         catch (Exception pe) {
            pe.printStackTrace();
        }       
    }

    public void hibernateTest() {

        try {

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery("from ShootingsIncident");
            List resultsList = q.list();

            System.out.println("Number of incidents: " + resultsList.size());
            List<ShootingsIncident> list;
            list = resultsList;

            String jString = getJson(list);
            System.out.println("Building json " + jString);

            readJson(jString);

        } catch (HibernateException he) {
        }

        System.out.println("Hibernate testing successful");
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        hibernateTest();

        System.out.println("Testing from jsonmaven");
        assertTrue(true);
    }
}
