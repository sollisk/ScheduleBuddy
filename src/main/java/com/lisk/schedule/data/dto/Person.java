package com.lisk.schedule.data.dto;

import com.lisk.schedule.data.enumeration.UserRole;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    @Schema(description = "ID of person in the DB")
    private int personID;
    @Schema(description = "First name of Artist/Customer")
    private String firstName;
    @Schema(description = "Last name of Artist/Customer")
    private String lastName;
    @Schema(description = "Whether the user is an Artist or a Customer")
    private UserRole userRole;
    @Schema(description = "User's email address")
    private String userEmail;
    @Schema(description = "User's phone number. Stripped on non-numeric characters", example = "4797008888")
    private String phoneNumber;
    @Schema(description = "Timezone User is in")
    private String timeZone;
}
