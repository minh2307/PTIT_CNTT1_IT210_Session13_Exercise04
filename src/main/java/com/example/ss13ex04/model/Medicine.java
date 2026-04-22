package com.example.ss13ex04.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "medicines")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medicine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    
    @Column(name = "manufacturer", length = 100)
    private String manufacturer;
    
    @Column(name = "expiry_date", nullable = false)
    private LocalDate expiryDate;
    
    @Column(name = "price", precision = 10, scale = 2)
    private Double price;
    
    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;
    
    @Column(name = "description", length = 500)
    private String description;

}
