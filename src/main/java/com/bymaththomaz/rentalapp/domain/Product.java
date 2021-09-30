package com.bymaththomaz.rentalapp.domain;

import com.bymaththomaz.rentalapp.enums.GameGenre;
import com.bymaththomaz.rentalapp.enums.GamePlatform;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.math.BigDecimal;
import javax.validation.constraints.DecimalMin;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name = "tb_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sku;

    @Column(nullable = false)
    private String barCode;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GamePlatform platform;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GameGenre genre;

    @Column(nullable = false, precision = 21, scale = 2)
    @DecimalMin(value = "0.00", message = "Price must be non negative.")
    private BigDecimal price;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private String description;

    private String productImage;

    @ColumnDefault("true")
    private Boolean available;

}
