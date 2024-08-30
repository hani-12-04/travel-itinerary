package com.example.travel_itinerary.model;

import java.time.LocalDate;
import java.util.List;

public class Destination {
   
    private long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> activities;
    private boolean[] activityStatus;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public List<String> getActivities() {
        return activities;
    }
    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
    public boolean[] getActivityStatus() {
        return activityStatus;
    }
    public void setActivityStatus(boolean[] activityStatus) {
        this.activityStatus = activityStatus;
    }
    
}
