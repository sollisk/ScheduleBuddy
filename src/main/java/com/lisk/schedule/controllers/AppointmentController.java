package com.lisk.schedule.controllers;

import com.lisk.schedule.data.dto.Appointment;
import com.lisk.schedule.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
@Slf4j
public class AppointmentController {

    AppointmentService appointmentService;

    @GetMapping("retrieve/{id}")
    public Appointment retrieveBaseAppointmentDetails(@PathVariable Integer id) {
        return appointmentService.retrieveAppointmentById(id);
    }
}