/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author kwoodall
 */
@RemoteServiceRelativePath("gwtserviceedit")
public interface GWTServiceEdit extends RemoteService {

    public String myMethod(String s);
}
