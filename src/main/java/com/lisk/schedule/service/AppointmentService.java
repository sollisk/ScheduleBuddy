package com.lisk.schedule.service;

import com.lisk.schedule.data.dto.Appointment;
import com.lisk.schedule.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private AppointmentRepository appointmentRepository;

    public Appointment retrieveAppointmentById(int appointmentId) {
        return null;
    }

    public List<Appointment> retrieveAppointmentsByDatesA(LocalDateTime startDate, int dayRange) {
        return null;
    }

}
