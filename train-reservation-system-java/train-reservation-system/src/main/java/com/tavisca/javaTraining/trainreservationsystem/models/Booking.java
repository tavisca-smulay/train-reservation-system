package com.tavisca.javaTraining.trainreservationsystem.models;

import java.util.List;

public class Booking {
    private int bookingId;
    private List<Passenger> passengerList;
    private String sourceStation;
    private String destinationStation;
    private int TrainId;
    private BookingStatus bookingStatus;
}
