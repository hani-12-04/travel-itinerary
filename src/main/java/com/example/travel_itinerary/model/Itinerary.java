package com.example.travel_itinerary.model;

import java.util.List;

public class Itinerary {

    private Long id;
    private String userID;
    private List<Destination> destination;
    private int totalDays;
   
    // public getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public List<Destination> getDestination() {
        return destination;
    }
    public void setDestination(List<Destination> destination) {
        this.destination = destination;
    }
    public int getTotalDays() {
        return totalDays;
    }
    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
}
