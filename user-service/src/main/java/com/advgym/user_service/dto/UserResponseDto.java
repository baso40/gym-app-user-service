package com.advgym.user_service.dto;

import java.time.LocalDateTime;

import com.advgym.user_service.entity.Gender;
import com.advgym.user_service.entity.UserRole;
import com.advgym.user_service.entity.UserStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Jacksonized
@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDateTime dateOfBirth;
    private Gender gender;
    private String address;
    private String emergencyContact;
    private UserStatus status;
    private UserRole role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
