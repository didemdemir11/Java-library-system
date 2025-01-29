package com.workintech.javalibrarysystem.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {
    @ManyToOne
    private Author author;
    private String name;
    private double price;
    private String status;
    private String edition;
    private LocalDate purchaseDate;


}
