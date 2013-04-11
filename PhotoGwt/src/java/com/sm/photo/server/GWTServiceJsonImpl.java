/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import com.sm.photo.client.GWTServiceJson;

/**
 *
 * @author kwoodall
 */
public class GWTServiceJsonImpl extends RemoteServiceServlet implements GWTServiceJson {

    public String myMethod(String s) {
        // Do something interesting with 's' here on the server.
        return "Server says: " + s;
    }
}
