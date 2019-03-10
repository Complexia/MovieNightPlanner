package com.example.movienightplanner;

import java.util.Date;
import java.util.List;

public class Event {

    private String eventID;
    private String eventName;
    private Date eventStartDate;
    private Date eventEndDate;
    private String eventVenue;
    private String eventLocation;
    private List eventAttendees;

    public Event(String eventID, String eventName, Date eventStartDate, Date eventEndDate,
                 String eventVenue, String eventLocation, List eventAttendees) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.eventVenue = eventVenue;
        this.eventLocation = eventLocation;
        this.eventAttendees = eventAttendees;
    }

}
