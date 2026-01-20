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
    @Schema(description = "User that requested the appointment")
    private Person requestedByUser;
    @Schema(description = "Requested Appointment date in UTC")
    private LocalDateTime appointmentDate;
    @Schema(description = "Placement of wanted tattoo")
    private String placement;
    @Schema(description = "Description of art wanted")
    private String artDescription;
    @Builder.Default
    @Schema(description = "Has appointment date/time been accepted by the ARTIST")
    private boolean isAppointmentConfirmed = false;
    @Builder.Default
    @Schema(description = "Has the CUSTOMER paid the deposit")
    private boolean isDepositPaid = false;
}
