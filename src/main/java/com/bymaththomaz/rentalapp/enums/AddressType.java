package com.bymaththomaz.rentalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AddressType {
    HOME("Home"),
    WORKPLACE("Workplace");

    private final String description;
}
