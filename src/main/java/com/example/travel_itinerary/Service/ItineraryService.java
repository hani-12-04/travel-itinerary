package com.example.travel_itinerary.Service;

import com.example.travel_itinerary.model.Destination;
import com.example.travel_itinerary.model.Itinerary;

public class ItineraryService {

    // method to validate itinerary dates
    public boolean isValid(Itinerary itinerary) {
        for (Destination destination : itinerary.getDestination()) {
            if ((destination.getStartDate()).isAfter(destination.getEndDate())){
                return false;
            }
        }
        return true;
    }
    
}
