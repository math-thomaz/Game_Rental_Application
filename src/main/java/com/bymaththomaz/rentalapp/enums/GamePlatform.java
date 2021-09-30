package com.bymaththomaz.rentalapp.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GamePlatform {
    PLAYSTATION_3("Playstation 3"),
    PLAYSTATION_4("Playstation 4"),
    PLAYSTATION_5("Playstation 5"),
    XBOX360("Xbox 360"),
    XBOXONE("Xbox One"),
    XBOXSERIES("Xbox Series"),
    PSP("PSP"),
    PSVITA("PS Vita"),
    NINTENDODS("Nintendo DS"),
    NINTENDO3DS("Nintendo 3DS"),
    NINTENDOSWITCH("Nintendo Switch");

    private final String description;
}
