package com.lisk.schedule.controllers;

import com.lisk.schedule.data.dto.Appointment;
import com.lisk.schedule.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
@Slf4j
public class AppointmentController {

    AppointmentService appointmentService;

    @GetMapping("retrieve")
    public Appointment retrieveBaseAppointmentDetails() {
        return null;
    }
}
