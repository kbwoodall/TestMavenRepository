/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.MenuBar;
import com.sm.photo.client.photo.GWTServiceUsagePhoto;

/**
 * Main entry point.
 *
 * @author kwoodall
 */
public class MainEntryPoint implements EntryPoint {
    
    final GWTServiceUsagePhoto gwtPhoto = new GWTServiceUsagePhoto();
    final GWTServiceJsonUsageExample gwtJson = new GWTServiceJsonUsageExample();
    final Image rjSplash = new Image("logo-212x144.png");   
        
    /** 
     * Creates a new instance of MainEntryPoint
     */
    public MainEntryPoint() {
    }

    /** 
     * The entry point method, called automatically by loading a module
     * that declares an implementing class as an entry-point
     */
    public void onModuleLoad() {
        //final Label label = new Label("Hello, GWT!!!");
        //final Button button = new Button("Click me!");        
        //button.addClickHandler(new ClickHandler() {
        //    public void onClick(ClickEvent event) {
        //        label.setVisible(!label.isVisible());
        //    }
        //});
        //RootPanel.get().add(button);
        //RootPanel.get().add(label);
        
        Command viewCmd = new Command() {

            public void execute() {
                gwtJson.removeFromParent(); 
                rjSplash.removeFromParent(); 
                RootPanel.get().add(gwtPhoto); 
            }
        };

        Command unusedCmd = new Command() {

            public void execute() {
                gwtJson.removeFromParent(); 
                gwtPhoto.removeFromParent(); 
                RootPanel.get().add(rjSplash); 
            }
        };
        
        Command editCmd = new Command() {

            public void execute() {
                gwtPhoto.removeFromParent(); 
                rjSplash.removeFromParent(); 
                RootPanel.get().add(gwtJson); 
            }
        };
         
        rjSplash.addStyleName("rj-image");
                                     
        MenuBar editMenu = new MenuBar(true);
        editMenu.addStyleName("demo-MenuBar");
        editMenu.addItem("the", unusedCmd);
        editMenu.addItem("edit", editCmd);
        editMenu.addItem("menu", unusedCmd);

        MenuBar viewMenu = new MenuBar(true);
        viewMenu.addStyleName("demo-MenuBar");
        viewMenu.addItem("the", unusedCmd);
        viewMenu.addItem("view", viewCmd);
        viewMenu.addItem("menu", unusedCmd);

        MenuBar navMenu = new MenuBar(true);
        navMenu.addStyleName("demo-MenuBar");
        navMenu.addItem("the", unusedCmd);
        navMenu.addItem("nav", unusedCmd);
        navMenu.addItem("menu", unusedCmd);
       
        MenuBar menu = new MenuBar();
        menu.addStyleName("demo-MenuBar");
        menu.addItem("Edit", editMenu);
        menu.addItem("View", viewMenu);
        menu.addItem("Navigate", navMenu);

        RootPanel.get().add(menu);  
        RootPanel.get().add(rjSplash); 
            
    }
}

