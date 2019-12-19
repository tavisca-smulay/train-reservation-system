package com.tavisca.javaTraining.trainreservationsystem.controller;

import com.tavisca.javaTraining.trainreservationsystem.models.User;
import com.tavisca.javaTraining.trainreservationsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    //Register-Login APIs

    @PostMapping("/login")
    public void userLogin(){

    }

    @PostMapping("/register")
    public String registerUser(@RequestBody User user){
        userService.registerUser(user);
        return "OK";
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
