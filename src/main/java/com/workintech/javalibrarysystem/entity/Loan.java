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
public class Loan extends BaseEntity{

    @ManyToOne
    private Book book;

    @ManyToOne
    private Reader reader;

    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

}
