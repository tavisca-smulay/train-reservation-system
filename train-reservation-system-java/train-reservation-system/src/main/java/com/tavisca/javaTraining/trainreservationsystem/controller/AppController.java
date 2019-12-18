package com.tavisca.javaTraining.trainreservationsystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AppController {

    //Register-Login APIs

    @PostMapping("/user/login")
    public void userLogin(){

    }

    @PostMapping("user/register")
    public void registerUser(){

    }

    @PostMapping("admin/login")
    public void adminLogin(){

    }

    //Admin Services APIs

    @GetMapping("/admin/trains")
     public void getAllTrains(){

     }

     @GetMapping("admin/trains/{id}")
    public void getTrainById(){

     }

     @PostMapping("admin/trains")
    public  void createTrain(){

     }

     @PutMapping("admin/train/{id}")
    public void updateTrainById(){

     }

     @DeleteMapping("admin/train/{id}")
    public void deleteTrainById(){

     }

     //User Services APIs

    @GetMapping("user/between/{sourceStation}/{destinationStation}/{date}")
     public void getTrainsBetweenStations(){

    }

    @GetMapping("user/trains/{id}")
    public void getSpecificTrainDetails(){

    }

    @PostMapping("user/trains/{id}/book")
    //Passenger Info in Request Body
    public boolean bookSeat(){
        return false;
    }

    @GetMapping("user/bookings")
    public void getAllBookings(){

    }

    @DeleteMapping("user/bookings/{id}")
    public void cancelBooking(){

    }
}
