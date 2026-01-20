package com.lisk.schedule.controllers;

import com.lisk.schedule.data.dto.Appointment;
import com.lisk.schedule.data.dto.Person;
import com.lisk.schedule.data.enumeration.UserRole;
import com.lisk.schedule.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
public class RetrieveAppointmentController {

    AppointmentService appointmentService;

    @GetMapping("retrieve/tattoo")
    public Appointment retrieveBaseAppointmentDetails() {

    }
}
