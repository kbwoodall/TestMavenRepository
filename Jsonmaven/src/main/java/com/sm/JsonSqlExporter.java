/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm;

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
 *
 * @author kwoodall
 */
public class JsonSqlExporter {

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
        } catch (Exception pe) {
            String eMessage = pe.getMessage();
        }
    }

    public String hibernateTest() {

        String jString = "";
        try {

            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery("from ShootingsIncident");
            List resultsList = q.list();

            System.out.println("Number of incidents: " + resultsList.size());
            List<ShootingsIncident> list;
            list = resultsList;

            jString = getJson(list);
            System.out.println("Building json " + jString);

            readJson(jString);

        } catch (HibernateException he) {
        }
        System.out.println("Hibernate testing successful");
        return jString;
    }
}
