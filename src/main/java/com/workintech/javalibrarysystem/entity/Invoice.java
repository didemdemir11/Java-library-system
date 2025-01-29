package com.workintech.javalibrarysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice extends BaseEntity{
    @ManyToOne
    private Loan loan;

    private double amount;
    private LocalDate issueDate;
}
