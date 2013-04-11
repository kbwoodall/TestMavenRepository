/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.server.photo;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import com.sm.photo.client.photo.GWTService;

/**
 *
 * @author kwoodall
 */
public class GWTServiceImpl extends RemoteServiceServlet implements GWTService {

    public String myMethod(String s) {
        // Do something interesting with 's' here on the server.
        return "Message returned: " + s;
    }
}
