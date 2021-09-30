package com.bymaththomaz.rentalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SexType {

    MALE("Male"),
    FEMALE("Female");

    private final String description;
}
