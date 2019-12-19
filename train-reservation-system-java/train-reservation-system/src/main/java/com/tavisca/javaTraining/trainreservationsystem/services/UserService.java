package com.tavisca.javaTraining.trainreservationsystem.services;

import com.tavisca.javaTraining.trainreservationsystem.models.User;
import com.tavisca.javaTraining.trainreservationsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public void registerUser(User user) {
        userRepository.save(user);
    }
}
