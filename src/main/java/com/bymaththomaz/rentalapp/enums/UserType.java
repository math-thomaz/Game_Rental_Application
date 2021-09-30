package com.bymaththomaz.rentalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserType {
    USER("User"),
    EMPLOYEE("Employee"),
    ADMIN("Admin");

    private final String description;
}
