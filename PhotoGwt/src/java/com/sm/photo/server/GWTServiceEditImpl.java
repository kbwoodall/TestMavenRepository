/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import com.sm.photo.client.GWTServiceEdit;

/**
 *
 * @author kwoodall
 */
public class GWTServiceEditImpl extends RemoteServiceServlet implements GWTServiceEdit {

    public String myMethod(String s) {
        // Do something interesting with 's' here on the server.
        return "Server says: " + s;
    }
}
