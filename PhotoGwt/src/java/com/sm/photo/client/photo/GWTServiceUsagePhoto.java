/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sm.photo.client.photo;

import com.google.gwt.core.client.GWT;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextArea;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.MenuBar;

/**
 * Example class using the GWTService service.
 *
 * @author kwoodall
 */
public class GWTServiceUsagePhoto extends VerticalPanel {

    private static Label lblServerReply = new Label();
    private Label browseLabel = new Label("  Browse  ");
    private Button lessButton = new Button("<");
    private Button greaterButton = new Button(">");
    public static TextArea storyIdeaBox = new TextArea();
    private static TextBox idBox = new TextBox();
    private static TextBox dateCreatedBox = new TextBox();
    private static TextBox assignmentTypeBox = new TextBox();
    private static TextBox assignmentDueBox = new TextBox();
    private static TextBox runDateBox = new TextBox();
    private static TextBox addressBox = new TextBox();
    private static TextBox cityBox = new TextBox();
    private static TextBox canBeRescheduledBox = new TextBox();
    private static TextBox reporterThereBox = new TextBox();
    private static TextBox shotsNeededBox = new TextBox();
    private static TextBox photographerNameBox = new TextBox();
    private static TextBox photographerPhoneBox = new TextBox();
    private static TextArea photoNotesBox = new TextArea();
    private static TextBox reporterNameBox = new TextBox();
    private static TextBox reporterPhoneBox = new TextBox();
    private static TextBox editorNameBox = new TextBox();
    private static TextBox editorPhoneBox = new TextBox();
    private static TextBox contactNameBox = new TextBox();
    private static TextBox contactPhoneBox = new TextBox();
    private static TextArea notesBox = new TextArea();
    private static TextBox sectionNameBox = new TextBox();
    private static TextArea photoLocationBox = new TextArea();
    private static TextBox photoTypeBox = new TextBox();
    private static TextBox eventDateBox = new TextBox();
    private static TextBox requestorBox = new TextBox();
    private Label space = new HTML("<br>");
    private Label hdg = new HTML("Photo Update Screen<br><br>");
    static String callMessage = "";
    String urlx = "http://appdev01.stephensmedia.com:5030/PhotoService-1.0-SNAPSHOT/PhotoServlet?id=";
    String url = "http://localhost:8080/PhotoService-1.0-SNAPSHOT/PhotoServlet?id=";

    public GWTServiceUsagePhoto() {
 
        lessButton.setStyleName("gwt-button");
        greaterButton.setStyleName("gwt-button");

        Label idLabel = new Label("Id:");
        Label dateCreatedLabel = new Label("Date Created:");
        Label assignmentTypeLabel = new Label("Assignment Type:");
        Label assignmentDueLabel = new Label("Assignment Due:");
        Label runDateLabel = new Label("Run Date:");
        Label addressLabel = new Label("Address:");
        Label cityLabel = new Label("City:");
        Label canBeRescheduledLabel = new Label("Can Be Rescheduled:");
        Label reporterThereLabel = new Label("Reporter There:");
        Label shotsNeededLabel = new Label("Shots Needed:");
        Label photographerNameLabel = new Label("Photographer Name:");
        Label photographerPhoneLabel = new Label("Photographer Phone:");
        Label photoNotesLabel = new Label("Photo Notes:");
        photoNotesBox.setCharacterWidth(40);
        photoNotesBox.setVisibleLines(5);
        Label reporterNameLabel = new Label("Reporter Name:");
        Label reporterPhoneLabel = new Label("Reporter Phone:");
        Label editorNameLabel = new Label("Editor Name:");
        Label editorPhoneLabel = new Label("Editor Phone:");
        Label contactNameLabel = new Label("Contact Name:");
        Label contactPhoneLabel = new Label("Contact Phone:");
        Label storyIdeaLabel = new Label("Story Idea:");
        storyIdeaBox.setCharacterWidth(40);
        storyIdeaBox.setVisibleLines(5);
        Label notesLabel = new Label("Notes:");
        notesBox.setCharacterWidth(40);
        notesBox.setVisibleLines(5);
        Label sectionNameLabel = new Label("Section Name:");
        Label photoLocationLabel = new Label("Photo Location:");
        photoLocationBox.setCharacterWidth(40);
        photoLocationBox.setVisibleLines(5);
        Label photoTypeLabel = new Label("Photo Type:");
        Label eventDateLabel = new Label("Event Date:");
        Label requestorLabel = new Label("Requestor:");

        //------------------------------------------------------------------------        
        Button button = new Button("Submit");
        //------------------------------------------------------------------------

        Grid grid = new Grid(15, 4);

        grid.setWidget(0, 0, idLabel);
        grid.setWidget(0, 1, idBox);

        grid.setWidget(0, 2, dateCreatedLabel);
        grid.setWidget(0, 3, dateCreatedBox);

        grid.setWidget(1, 0, assignmentTypeLabel);
        grid.setWidget(1, 1, assignmentTypeBox);

        grid.setWidget(1, 2, runDateLabel);
        grid.setWidget(1, 3, runDateBox);

        grid.setWidget(2, 0, addressLabel);
        grid.setWidget(2, 1, addressBox);

        grid.setWidget(2, 2, cityLabel);
        grid.setWidget(2, 3, cityBox);

        grid.setWidget(3, 0, canBeRescheduledLabel);
        grid.setWidget(3, 1, canBeRescheduledBox);

        grid.setWidget(3, 2, reporterThereLabel);
        grid.setWidget(3, 3, reporterThereBox);

        grid.setWidget(4, 0, shotsNeededLabel);
        grid.setWidget(4, 1, shotsNeededBox);

        grid.setWidget(5, 0, photographerNameLabel);
        grid.setWidget(5, 1, photographerNameBox);

        grid.setWidget(5, 2, photographerPhoneLabel);
        grid.setWidget(5, 3, photographerPhoneBox);

        grid.setWidget(6, 0, reporterNameLabel);
        grid.setWidget(6, 1, reporterNameBox);

        grid.setWidget(6, 2, reporterPhoneLabel);
        grid.setWidget(6, 3, reporterPhoneBox);

        grid.setWidget(7, 0, editorNameLabel);
        grid.setWidget(7, 1, editorNameBox);

        grid.setWidget(7, 2, editorPhoneLabel);
        grid.setWidget(7, 3, editorPhoneBox);

        grid.setWidget(8, 0, contactNameLabel);
        grid.setWidget(8, 1, contactNameBox);

        grid.setWidget(8, 2, contactPhoneLabel);
        grid.setWidget(8, 3, contactPhoneBox);

        grid.setWidget(9, 0, storyIdeaLabel);
        grid.setWidget(9, 1, storyIdeaBox);

        grid.setWidget(9, 2, notesLabel);
        grid.setWidget(9, 3, notesBox);

        grid.setWidget(10, 0, photoLocationLabel);

        grid.setWidget(10, 1, photoLocationBox);

        grid.setWidget(10, 2, photoNotesLabel);
        grid.setWidget(10, 3, photoNotesBox);

        grid.setWidget(11, 0, sectionNameLabel);
        grid.setWidget(11, 1, sectionNameBox);

        grid.setWidget(11, 2, photoTypeLabel);
        grid.setWidget(11, 3, photoTypeBox);

        grid.setWidget(12, 0, eventDateLabel);
        grid.setWidget(12, 1, eventDateBox);

        grid.setWidget(12, 2, requestorLabel);
        grid.setWidget(12, 3, requestorBox);

        grid.setWidget(13, 0, assignmentDueLabel);
        grid.setWidget(13, 1, assignmentDueBox);

        add(hdg);
        add(grid);

        HorizontalPanel hp = new HorizontalPanel();

        hp.add(lessButton);
        hp.add(browseLabel);
        hp.add(greaterButton);

        add(hp);
        add(space);

        add(lblServerReply);

        // Create an asynchronous callback to handle the result.
        final AsyncCallback<String> callback = new AsyncCallback<String>() {

            public void onSuccess(String result) {
                lblServerReply.setText(result);
            }

            public void onFailure(Throwable caught) {
                lblServerReply.setText("Communication failed");
            }
        };

        // Listen for the button clicks
        lessButton.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                // Make remote call. Control flow will continue immediately and later
                // 'callback' will be invoked when the RPC completes.
                //getService().myMethod(txtUserInput.getText(), callback);                

                /*
                JSONValue photoLocationBoxValue = new JSONString(photoLocationBox.getText());
                JSONValue photoNotesBoxValue = new JSONString(photoNotesBox.getText());
                
                JSONObject obj = new JSONObject();
                obj.put("photoLocation", photoLocationBoxValue);
                obj.put("photoNotes", photoNotesBoxValue);
                
                callMessage = obj.toString();
                getService().myMethod(callMessage, callback);
                 */
                String sId = idBox.getValue();

                if (sId.isEmpty()) {
                    sId = "0";
                    doPost(url, sId, "less");
                } else if (isInteger(sId)) {
                    doPost(url, sId, "less");
                } else {
                    String non = "";
                    idBox.setValue("Id not numeric");
                    storyIdeaBox.setValue(non);
                    eventDateBox.setValue(non);
                    sectionNameBox.setValue(non);
                    cityBox.setValue(non);
                    photoLocationBox.setValue(non);
                    requestorBox.setValue(non);
                    photographerNameBox.setValue(non);
                    dateCreatedBox.setValue(non);
                    assignmentTypeBox.setValue(non);
                    photographerPhoneBox.setValue(non);
                    reporterThereBox.setValue(non);
                    canBeRescheduledBox.setValue(non);
                    shotsNeededBox.setValue(non);
                    assignmentDueBox.setValue(non);
                    photoTypeBox.setValue(non);
                    contactPhoneBox.setValue(non);
                    editorPhoneBox.setValue(non);
                    runDateBox.setValue(non);
                    reporterNameBox.setValue(non);
                    editorNameBox.setValue(non);
                    addressBox.setValue(non);
                    contactNameBox.setValue(non);
                    reporterPhoneBox.setValue(non);
                    notesBox.setValue(non);
                    photoNotesBox.setValue(non);
                    lblServerReply.setText("Message: Id not numeric");
                }
            }
        });

        greaterButton.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                // Make remote call. Control flow will continue immediately and later
                // 'callback' will be invoked when the RPC completes.
                //getService().myMethod(txtUserInput.getText(), callback);              

                String sId = idBox.getValue();

                if (sId.isEmpty()) {
                    sId = "0";
                    doPost(url, sId, "greater");
                } else if (isInteger(sId)) {
                    doPost(url, sId, "greater");
                } else {
                    String non = "";
                    idBox.setValue("Id not numeric");
                    storyIdeaBox.setValue(non);
                    eventDateBox.setValue(non);
                    sectionNameBox.setValue(non);
                    cityBox.setValue(non);
                    photoLocationBox.setValue(non);
                    requestorBox.setValue(non);
                    photographerNameBox.setValue(non);
                    dateCreatedBox.setValue(non);
                    assignmentTypeBox.setValue(non);
                    photographerPhoneBox.setValue(non);
                    reporterThereBox.setValue(non);
                    canBeRescheduledBox.setValue(non);
                    shotsNeededBox.setValue(non);
                    assignmentDueBox.setValue(non);
                    photoTypeBox.setValue(non);
                    contactPhoneBox.setValue(non);
                    editorPhoneBox.setValue(non);
                    runDateBox.setValue(non);
                    reporterNameBox.setValue(non);
                    editorNameBox.setValue(non);
                    addressBox.setValue(non);
                    contactNameBox.setValue(non);
                    reporterPhoneBox.setValue(non);
                    notesBox.setValue(non);
                    photoNotesBox.setValue(non);
                    lblServerReply.setText("Message: Id not numeric");
                }
            }
        });
    }

    public static GWTServiceAsync getService() {
        // Create the client proxy. Note that although you are creating the
        // service interface proper, you cast the result to the asynchronous
        // version of the interface. The cast is always safe because the
        // generated proxy implements the asynchronous interface automatically.

        return GWT.create(GWTService.class);
    }
    // Send request to server and catch any errors.

    public static void doPost(String url, String postData, String next) {
        final String uString = url + postData + "&next=" + next;

        lblServerReply.setText("Message: Processing .....");

        //Window.alert(uString);

        RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, uString);

        try {
            builder.setHeader("Content-Type", "application/x-www-form-urlencoded");
            Request response = builder.sendRequest(null, new RequestCallback() {

                public void onError(Request request, Throwable exception) {
                    Window.alert(exception.getMessage());
                }

                public void onResponseReceived(Request request, Response response) {

                    JSONValue resValue = JSONParser.parse(response.getText());
                    JSONObject resObject;

                    if ((resObject = resValue.isObject()) == null) {
                        GWT.log("resObject is unexpected type", null);
                    }

                    String id = resObject.get("id").isString().stringValue();

                    if (isInteger(id)) {
                        idBox.setValue(id);
                        String storyIdea = resObject.get("storyIdea").isString().stringValue();
                        storyIdeaBox.setValue(storyIdea);

                        String eventDate = resObject.get("eventDate").isString().stringValue();
                        eventDateBox.setValue(eventDate);

                        String sectionName = resObject.get("sectionName").isString().stringValue();
                        sectionNameBox.setValue(sectionName);

                        String city = resObject.get("city").isString().stringValue();
                        cityBox.setValue(city);

                        String photoLocation = resObject.get("photoLocation").isString().stringValue();
                        photoLocationBox.setValue(photoLocation);

                        String requestor = resObject.get("requestor").isString().stringValue();
                        requestorBox.setValue(requestor);

                        String photographerName = resObject.get("photographerName").isString().stringValue();
                        photographerNameBox.setValue(photographerName);

                        String dateCreated = resObject.get("created").isString().stringValue();
                        dateCreatedBox.setValue(dateCreated);

                        String assignmentType = resObject.get("assignmentType").isString().stringValue();
                        assignmentTypeBox.setValue(assignmentType);

                        String photographerPhone = resObject.get("photographerPhone").isString().stringValue();
                        photographerPhoneBox.setValue(photographerPhone);

                        String reporterThere = resObject.get("reporterThere").isBoolean().toString();
                        reporterThereBox.setValue(reporterThere);

                        String canBeRescheduled = resObject.get("canBeRescheduled").isBoolean().toString();
                        canBeRescheduledBox.setValue(canBeRescheduled);

                        String shotsNeeded = resObject.get("shotsNeeded").isBoolean().toString();
                        shotsNeededBox.setValue(shotsNeeded);

                        String assignmentDue = resObject.get("assignmentDue").isString().stringValue();
                        assignmentDueBox.setValue(assignmentDue);

                        String photoType = resObject.get("photoType").isString().stringValue();
                        photoTypeBox.setValue(photoType);

                        String contactPhone = resObject.get("contactPhone").isString().stringValue();
                        contactPhoneBox.setValue(contactPhone);

                        String editorPhone = resObject.get("editorPhone").isString().stringValue();
                        editorPhoneBox.setValue(editorPhone);

                        String runDate = resObject.get("runDate").isString().stringValue();
                        runDateBox.setValue(runDate);

                        String reporterName = resObject.get("reporterName").isString().stringValue();
                        reporterNameBox.setValue(reporterName);

                        String editorName = resObject.get("editorName").isString().stringValue();
                        editorNameBox.setValue(editorName);

                        String address = resObject.get("address").isString().stringValue();
                        addressBox.setValue(address);

                        String contactName = resObject.get("contactName").isString().stringValue();
                        contactNameBox.setValue(contactName);

                        String reporterPhone = resObject.get("reporterPhone").isString().stringValue();
                        reporterPhoneBox.setValue(reporterPhone);

                        String notes = resObject.get("notes").isString().stringValue();
                        notesBox.setValue(notes);

                        String photoNotes = resObject.get("photoNotes").isString().stringValue();
                        photoNotesBox.setValue(photoNotes);

                        lblServerReply.setText("Message: Query complete");

                    } else {
                        String non = "";
                        idBox.setValue(id);
                        storyIdeaBox.setValue(non);
                        eventDateBox.setValue(non);
                        sectionNameBox.setValue(non);
                        cityBox.setValue(non);
                        photoLocationBox.setValue(non);
                        requestorBox.setValue(non);
                        photographerNameBox.setValue(non);
                        dateCreatedBox.setValue(non);
                        assignmentTypeBox.setValue(non);
                        photographerPhoneBox.setValue(non);
                        reporterThereBox.setValue(non);
                        canBeRescheduledBox.setValue(non);
                        shotsNeededBox.setValue(non);
                        assignmentDueBox.setValue(non);
                        photoTypeBox.setValue(non);
                        contactPhoneBox.setValue(non);
                        editorPhoneBox.setValue(non);
                        runDateBox.setValue(non);
                        reporterNameBox.setValue(non);
                        editorNameBox.setValue(non);
                        addressBox.setValue(non);
                        contactNameBox.setValue(non);
                        reporterPhoneBox.setValue(non);
                        notesBox.setValue(non);
                        photoNotesBox.setValue(non);

                        lblServerReply.setText("Message: Id not found");
                    }
                }
            });
        } catch (RequestException e) {
            Window.alert("Failed to send the request: " + e.getMessage());
        }
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getString(JSONValue value) {
        if (value == null) {
            return "";
        }
        if (value.isString() != null) {
            return value.isString().stringValue();
        }
        return value.toString();
    }
}
