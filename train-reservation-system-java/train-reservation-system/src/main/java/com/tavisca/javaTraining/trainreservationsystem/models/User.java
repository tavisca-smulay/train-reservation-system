package com.tavisca.javaTraining.trainreservationsystem.models;

import java.util.List;

public class User {
    private int userId;
    private String userName;
    private String password;
    private String emailId;
    private UserRole role;
    private List<Integer> bookings;
}
