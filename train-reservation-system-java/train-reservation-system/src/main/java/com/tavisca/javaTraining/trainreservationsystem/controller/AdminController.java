package com.tavisca.javaTraining.trainreservationsystem.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/login")
    public void adminLogin(){

    }

    //Admin Services APIs

    @GetMapping("/trains")
    public void getAllTrains(){

    }

    @GetMapping("/trains/{id}")
    public void getTrainById(){

    }

    @PostMapping("/trains")
    public  void createTrain(){

    }

    @PutMapping("/train/{id}")
    public void updateTrainById(){

    }

    @DeleteMapping("/train/{id}")
    public void deleteTrainById(){

    }

}
