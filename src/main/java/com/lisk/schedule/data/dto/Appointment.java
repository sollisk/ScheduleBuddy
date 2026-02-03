package com.lisk.schedule.data.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import java.time.LocalDateTime;

@Data
@Builder
public class Appointment {
    @NonNull
    @Schema(description = "DB PK for Appointments table")
    private int appointmentID;
    @NonNull
    @Schema(description = "User that is providing service")
    private User artist;
    @NonNull
    @Schema(description = "User that is receiving service")
    private User customer;
    @Schema(description = "Requested Appointment date in UTC")
    private LocalDateTime appointmentDate;
    @Schema(description = "Placement of wanted work")
    private String placement;
    @Schema(description = "Description of wanted service")
    private String artDescription;
    @Builder.Default
    @Schema(description = "Has appointment date/time been accepted by the ARTIST")
    private boolean isAppointmentConfirmed = false;
    @Builder.Default
    @Schema(description = "Has the CUSTOMER paid the deposit")
    private boolean isDepositPaid = false;
    @Schema(description = "Monetary value of how much deposit was paid")
    private double depositAmount;
}
