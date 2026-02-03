package com.lisk.schedule.service;

import com.lisk.schedule.data.dto.User;
import com.lisk.schedule.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    UserRepository userRepository;

    public User retrievePersonByEmail (String userEmail) {
        return null;
    }

    public User retrievePersonByPhone(String phoneNumber) {
        return null;
    }

}