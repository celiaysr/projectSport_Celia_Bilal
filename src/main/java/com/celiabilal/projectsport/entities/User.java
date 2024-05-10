package com.celiabilal.projectsport.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;


    @OneToMany(mappedBy = "user")
    private List<Therapeutic> therapeutics;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany(mappedBy = "user")
    private List<Pathology> pathologies;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPathologies(List<Pathology> pathologies) {
        this.pathologies = pathologies;
    }

    public void setTherapeutics(List<Therapeutic> therapeutics) {
        this.therapeutics = therapeutics;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

