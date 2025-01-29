package com.workintech.javalibrarysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Librarian extends BaseEntity{
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Responsibility responsibility;
}
