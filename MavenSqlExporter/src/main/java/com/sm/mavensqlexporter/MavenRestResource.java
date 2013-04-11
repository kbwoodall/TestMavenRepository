/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.mavensqlexporter;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author kwoodall
 */
@Path("/MavenRest")
public class MavenRestResource {

    @Context
    private UriInfo context;

    /** Creates a new instance of MavenRestResource */
    public MavenRestResource() {
    }

    /**
     * Retrieves representation of an instance of com.sm.mavensqlexporter.MavenRestResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
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

        if (str.isEmpty()) {
            throw new UnsupportedOperationException();            
        }        
        return str;       

    }

    /**
     * PUT method for updating or creating an instance of MavenRestResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
