package com.example.travel_itinerary.model;

public class Place {

    private String name;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Destination extends Place {

    public Object getStartDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStartDate'");
    }

    public Object getEndDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEndDate'");
    }

}
