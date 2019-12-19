package com.tavisca.javaTraining.trainreservationsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


@Entity
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String userName;
    private String password;
    private String emailId;
    private UserRole role;
    private List<Integer> bookings;
}
