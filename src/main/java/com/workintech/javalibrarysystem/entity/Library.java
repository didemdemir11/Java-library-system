package com.workintech.javalibrarysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Library extends BaseEntity {
    private String name;
    private String location;

    @OneToMany(mappedBy = "library")
    private List<Book> books = new ArrayList<>();

    @OneToMany(mappedBy = "library")
    private List<Librarian> librarians = new ArrayList<>();

    @OneToMany(mappedBy = "library")
    private List<Reader> readers = new ArrayList<>();

}
