package com.bymaththomaz.rentalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GameGenre {
    ACTION_ADVENTURE("Action | ADVENTURE"),
    FAMILY("Family"),
    FIGHTING("Fighting"),
    MUSICAL("Musical"),
    RACING("Racing"),
    SPORTS("Sports"),
    RPG_STRATEGY("Strategy");

    private final String description;
}
