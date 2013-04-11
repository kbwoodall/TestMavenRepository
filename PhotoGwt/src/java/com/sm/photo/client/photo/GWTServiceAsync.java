/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.client.photo;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author kwoodall
 */
public interface GWTServiceAsync {

    public void myMethod(String s, AsyncCallback<String> callback);
}
