package com.tavisca.javaTraining.trainreservationsystem.models;

import java.util.Map;

public class Train {
    private int trainId;
    private String trainName;
    private Map<String,String> stations;

    public Train() {
    }

    public Train(int trainId, String trainName, Map<String, String> stations) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.stations = stations;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Map<String, String> getStations() {
        return stations;
    }

    public void setStations(Map<String, String> stations) {
        this.stations = stations;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", trainName='" + trainName + '\'' +
                ", stations=" + stations +
                '}';
    }
}
