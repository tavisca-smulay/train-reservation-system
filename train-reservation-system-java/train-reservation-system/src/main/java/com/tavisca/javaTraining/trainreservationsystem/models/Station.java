package com.tavisca.javaTraining.trainreservationsystem.models;

import java.util.List;

public class Station {
    private int stationId;
    private String stationName;
    private List<Integer> trains;

    public Station() {
    }

    public Station(int stationId, String stationName, List<Integer> trains) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.trains = trains;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Integer> getTrains() {
        return trains;
    }

    public void setTrains(List<Integer> trains) {
        this.trains = trains;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Station{" +
                "stationId=" + stationId +
                ", stationName='" + stationName + '\'' +
                ", trains=" + trains +
                '}';
    }
}
