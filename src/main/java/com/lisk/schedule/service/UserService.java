package com.lisk.schedule.service;

import com.lisk.schedule.data.dto.Person;
import com.lisk.schedule.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    UserRepository userRepository;

    public Person retrievePersonByEmail (String userEmail) {
        return null;
    }

    public Person retrievePersonByPhone(String phoneNumber) {
        return null;
    }

}