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
public class Category extends BaseEntity{
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Book> books = new ArrayList<>();
}
