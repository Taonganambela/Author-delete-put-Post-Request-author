package com.zmltd.author.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MyAuthor")

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String fName;
    private String title;
    private String pages;

}
