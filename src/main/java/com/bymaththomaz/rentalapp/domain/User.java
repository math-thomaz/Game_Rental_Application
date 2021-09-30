package com.bymaththomaz.rentalapp.domain;

import com.bymaththomaz.rentalapp.enums.SexType;
import com.bymaththomaz.rentalapp.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String identity;

    @Column(nullable = false, unique = true)
    private String itin;

    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SexType sex;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;

    private List<Address> addresses;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "default 'USER'" )
    private UserType userType;

}
