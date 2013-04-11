/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import org.json.simple.*;

//---------------------------------------------------------
//
//  http://localhost:8080/JsonWeb-1.0-SNAPSHOT/resources/json
//
//  http://appdev01.stephensmedia.com:5030/JsonWeb-1.0-SNAPSHOT/resources/json
//
//  on appdev01  ./deploy Json.....war
//
// --------------------------------------------------------

/**
 * REST Web Service
 *
 * @author kwoodall
 */
@Path("/json")
public class JsonResource {

    @Context
    private UriInfo context;

    /** Creates a new instance of JsonResource */
    public JsonResource() {
    }

    /**
     * Retrieves representation of an instance of com.sm.JsonResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/jsonrequest")
    public String getJson() {
        //TODO return proper representation object   
        
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
           
        JSONObject jObject = new JSONObject();
        jObject.put("name","Babe Ruth");         
        str = jObject.toJSONString();  

        if (str.isEmpty()) {
            throw new UnsupportedOperationException();            
        }        
        return str;    
        
    }
    
    public String getArrayJson() {
         
        JSONArray arrayObj = new JSONArray();
        
        JSONObject jObject = new JSONObject();
        jObject.put("name","Babe Ruth");        
        arrayObj.add(jObject);
        
        jObject = new JSONObject();
        jObject.put("name","Lou Gehrig");        
        arrayObj.add(jObject);   
        
        JSONObject tLevel = new JSONObject();
        
        tLevel.put("top",arrayObj);  
        
        String str = tLevel.toJSONString();      
        
        return null;
    }
    

    /**
     * PUT method for updating or creating an instance of JsonResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}

