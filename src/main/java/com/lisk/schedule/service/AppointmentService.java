package com.lisk.schedule.service;

import com.lisk.schedule.data.dto.Appointment;
import com.lisk.schedule.data.dto.Person;
import com.lisk.schedule.data.enumeration.UserRole;
import com.lisk.schedule.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private AppointmentRepository appointmentRepository;

    public Appointment retrieveAppointmentDetails(int appointmentId) {
        Person appointmentCreator = Person.builder().personID(0)
                .firstName("Bee")
                .lastName("Rainey")
                .userRole(UserRole.CUSTOMER)
                .build();

        return Appointment.builder()
                .requestedByUser(appointmentCreator)
                .appointmentDate(LocalDateTime.of(2026,9,24,13,42))
                .isAppointmentConfirmed(true)
                .isDepositPaid(true)
                .build();
    }

}
