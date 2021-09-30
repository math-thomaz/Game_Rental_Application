package com.bymaththomaz.rentalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    WORKPLACE("Workplace");

    private final String description;
}
