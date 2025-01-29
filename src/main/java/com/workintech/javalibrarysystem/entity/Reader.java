package com.workintech.javalibrarysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reader extends BaseEntity{
    private String name;
    private String email;

    @OneToMany(mappedBy = "reader")
    private List<Book> borrowedBooks = new ArrayList<>();
}
