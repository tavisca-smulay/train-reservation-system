package com.tavisca.javaTraining.trainreservationsystem.models;

import java.util.List;

public class Booking {
    private int bookingId;
    private List<Passenger> passengerList;
    private String sourceStation;
    private String destinationStation;
    private int TrainId;
    private BookingStatus bookingStatus;

    public Booking() {
    }

    public Booking(int bookingId, List<Passenger> passengerList, String sourceStation, String destinationStation, int trainId, BookingStatus bookingStatus) {
        this.bookingId = bookingId;
        this.passengerList = passengerList;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        TrainId = trainId;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public int getTrainId() {
        return TrainId;
    }

    public void setTrainId(int trainId) {
        TrainId = trainId;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", passengerList=" + passengerList +
                ", sourceStation='" + sourceStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                ", TrainId=" + TrainId +
                ", bookingStatus=" + bookingStatus +
                '}';
    }
}
