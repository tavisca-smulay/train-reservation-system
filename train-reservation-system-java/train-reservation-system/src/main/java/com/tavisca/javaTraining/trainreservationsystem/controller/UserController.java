package com.tavisca.javaTraining.trainreservationsystem.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {


    //Register-Login APIs

    @PostMapping("/login")
    public void userLogin(){

    }

    @PostMapping("/register")
    public void registerUser(){

    }


    //User Services APIs

    @GetMapping("/between/{sourceStation}/{destinationStation}/{date}")
    public void getTrainsBetweenStations(){

    }

    @GetMapping("/trains/{id}")
    public void getSpecificTrainDetails(){

    }

    @PostMapping("/trains/{id}/book")
    //Passenger Info in Request Body
    public boolean bookSeat(){
        return false;
    }

    @GetMapping("/bookings")
    public void getAllBookings(){

    }

    @DeleteMapping("/bookings/{id}")
    public void cancelBooking(){

    }
}
