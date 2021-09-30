package com.bymaththomaz.rentalapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class User {

    private Long id;
    private String email;
    private String name;
    private String identity;
    private String itin;
    private LocalDate birthDate;
    private String sex;
    private List<String> phones;
    private String userType;

}
